package com.exam;

import java.util.Scanner;

public class Test0716 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 >> ");
		String name = scanner.next();
		System.out.println("나이를 입력하세요 >> ");
		int age = scanner.nextInt();
		System.out.println("아이디를 입력하세요 >> ");
		String userid = scanner.next();
		System.out.println("비밀번호를 입력하세요 >> ");
		String pass = scanner.next();
			
		Test test = new Test(userid, pass, name, age);
		test.Test2();

	}

}
