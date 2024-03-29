<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Fun Web</title>
<link href="../css/default.css" rel="stylesheet" type="text/css" media="all">
<link href="../css/subpage.css" rel="stylesheet" type="text/css"  media="all">
<link href="../css/print.css" rel="stylesheet" type="text/css"  media="print">
<link href="../css/iphone.css" rel="stylesheet" type="text/css" media="screen">
<!--[if lt IE 9]>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js" type="text/javascript"></script>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js" type="text/javascript"></script>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->


<!--[if IE 6]>
 <script src="../script/DD_belatedPNG.js"></script>
 <script>
   /* EXAMPLE */
   DD_belatedPNG.fix('#wrap');
   DD_belatedPNG.fix('#sub_img');   
   DD_belatedPNG.fix('#sub_img_center'); 
   DD_belatedPNG.fix('#sub_img_member'); 

 </script>
 <![endif]--> 

</head>

<body>
<div id="wrap">
   <!-- 헤더영역 -->
 <jsp:include page="../include/header.jsp"/>
 
  <div class="clear"></div>
<div id="sub_img_center"></div>
<div class="clear"></div>
 
<%-- nav 영역 --%>
<jsp:include page="../include/nav_center.jsp"/>

<%--세션값 가져오기 --%>
<%
String id = (String)session.getAttribute("id");
%>


    
<article>
    
<h1>Notice Write</h1>

<form action="writeProcess.jsp" method="post" name="frm">
<table id="notice">
<%
if(id == null){ //로그인안했을때
	%>
	 <tr>
  <th class="twrite">이름</th>
  <td class="left" width="300">
  <input type="text" name="username">
  </td>  
  </tr>
      <tr>
  <th class="twrite">패스워드</th>
  <td class="left" >
  <input type="password" name="passwd">
  </td>  
  </tr>
	<%
}else{ // id != null  로그인했을때
	%>
	 <tr>
  <th class="twrite">아이디</th>
  <td class="left" width="300">
  <input type="text" name="username" value="<%=id %>" readonly>
  </td>  
  </tr>
	<%
}
%>
  
      <tr>
  <th class="twrite">제목</th>
  <td class="left" >
  <input type="text" name="subject">
  </td>  
  </tr>
  
        <tr>
  <th class="twrite">내용</th>
  <td class="left">
  <textarea name="content" rows="13" cols="40"></textarea>
  </td>  
  </tr>
  
</table>

<div id="table_search">
	<input type="submit" value="글쓰기" class="btn" >
	<input type="reset" value="다시작성" class="btn">
	<input type="button" value="목록보기" class="btn" onclick="location href='notice.jsp';">
</div>
</form>   
</article>
    
     <div class="clear"></div>
    
   <!-- 푸터영역 -->
     <jsp:include page="../include/footer.jsp"/>
</div>

</body>
</html>   

