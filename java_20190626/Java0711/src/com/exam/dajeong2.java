package com.exam;

public class dajeong2 {

	public static void main(String[] args) {
		// 1~ 50 / 랜덤한 정수들 / 평균
		
		int[]haha = new int[50];
		for(int a=0; a<haha.length; a++) {
			haha[a]= (int)(Math.random()*10)+1;
		}
		 System.out.println("랜덤정수: ");
		int num = 0;
		for(int num2 : haha) {
			System.out.print( num2 + " ");
			num += num2;
		}
		System.out.println();
		
		double avg = num / haha.length;
		System.out.println("평균" + avg);
		
		
		
		
	}//main

}
