package com.exam;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 2번

		
		
	int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
	for(int j=0; j<n.length; j++) {
		for(int g=0; g< n[j].length; g++) {
			System.out.print(n[j][g] + " ");	
		}
		System.out.println();
	}
	
	
	Scanner scan = new Scanner(System.in);
	
	int w[] = new int[10];
	
	System.out.print("양의 정수 10개를 입력하세용 >>");
	for(int i = 0; i < w.length; i++) {
		w[i] = scan.nextInt();		
	}
	
	System.out.print("3의배수는 ");
	for(int i = 0; i < w.length; i++) {
	  if(w[i] % 3 == 0) {
		System.out.print(w[i] + " ");  
	  }
	 
		  
	}
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
		
	} //main

}
