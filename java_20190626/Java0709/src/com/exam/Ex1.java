package com.exam;

public class Ex1 {
	public static void main(String[] args) {
		int s = 0;
		double a = 0;
	int scoArr[][] = {{85,60,70},{90,95,80},{75,80,100},{80,70,95},{100,65,80}};
		for(int i = 0; i<scoArr.length; i++) {
			System.out.printf("%d번 학생 : ", i+1);
			for(int j = 0; j<scoArr[i].length; j++) {
				System.out.print(scoArr[i][j] + "\t");
				s  +=  scoArr[i][j];
				a  = (double)s/scoArr[i].length;
			}System.out.printf("%d \t%.2f", s, a);
			 System.out.println();
			 s = 0;
			 a = 0;
		}

	}

}




      