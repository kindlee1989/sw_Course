package com.exam;

public class Test {
	
	
	String userid;
	private String pass;
	String name;
	int age;
	
	Test(String _userid, String _pass, String _name, int _age){
		
		userid = _userid;
		pass = _pass;
		name = _name;
		age = _age;		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	void Test2() {
		System.out.println("이름" + name + "님 가입을 환영합니다.");
	}
	
	

}
