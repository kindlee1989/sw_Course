package com.exam;

public class dajeong3 {

	public static void main(String[] args) {
		// 4x4의 2차원 배열 / 1~10 랜덤수 생성 
		
		int[][]num = new int[4][4];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = (int)(Math.random()*16+1);
				System.out.print(num[i][j] + " \t ");
			}
		System.out.println();
		}
		
	
			
		}
		
	}


