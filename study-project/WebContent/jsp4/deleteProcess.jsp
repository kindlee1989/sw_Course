<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%  
    //세션값가져오기
String id = (String) session.getAttribute("id");
// 세션값 없으면 loginForm.jsp로 이동
if(id == null){
	response.sendRedirect("loginForm.jsp");
	return;
}
%>

<%
//passwd 파라미터값 가져오기
String passwd = request.getParameter("passwd");

//DB접속정보
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

//1단계: DB 드라이버 로딩
Class.forName("oracle.jdbc.OracleDriver");
//2단계: DB연결
Connection con = DriverManager.getConnection(url, user, password);
//3단계: sql문 준비, id에 해당하는 passwd 가져오기
String sql = "SELECT passwd FROM member WHERE id = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
//4
ResultSet rs = pstmt.executeQuery();
//5단계: rs사용
//rs데이터 있으면
//패스워드 비교 맞으면 delete수행 후 loginForm.jsp 이동
//          틀리면 '패스워드틀림' 뒤로이동
if(rs.next()){
	if(passwd.equals(rs.getString("passwd"))){
		pstmt.close();
		
		sql = "DELETE FROM member WHERE id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		//실행
		pstmt.executeUpdate();
		//세션값 초기화
		session.invalidate();
		//response.sendRedirect("loginForm.jsp");
		%>
		<script>
		alert('회원삭제성공');
		location.href='loginForm.jsp';
		</script>
		
		<%
		
		
	}else{
		%>
		<script>
		alert('패스워드가 다릅니다.');
		history.back();
		</script>
		<%
	}
	
}
%>