package com.exam;

import java.util.Scanner;

public class dajeong5 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		Scanner scanner = new Scanner(System.in);
		
		String course []= {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		
		while(true) {
		System.out.print("과목이름 :");
		
		String name = scanner.next();
		
		if(name.equals("그만")) {
			break;
		}
	
		boolean isExist = false;
		for(int i=0; i<course.length; i++) {
			if( name.equals (course[i]) ) {
				isExist = true;
				System.out.println(name + "의 점수는" + score[i]);
				break;
			}
		}
		
//      for(  haha :   course ){
//      System.out.print(name + "의 점수" + score)		
//		}
		
		
		
		
		
		if(!isExist) {
			System.out.println("없는 과목입니다.");
		}
		
		} //while
		
		
		scanner.close();
		
	} // main

}
