package com.exam;

public class Ex1 {

	public static void printArr(int iArr[]) {
		for(int i = 0; i<iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
			System.out.println();
	}
	
	public static int[] sumArr(int iArr[]) {
		int s[] = new int [2];
		for(int i = 0; i<iArr.length; i++) {
			s[0] += iArr[i];
		}
			s[1] = s[0] / iArr.length;
			return s;
	}
	
	
	
	public static void main(String[] args) {
		int iArr[] = {10,20,30,40,50};
	
	
		printArr(iArr);
		System.out.println("배열 내부의 합 : " + sumArr(iArr)[0]);
		System.out.println("배열 내부의 평균 : " + sumArr(iArr)[1]);
		
	
	
	
	
	
	
	}

}
