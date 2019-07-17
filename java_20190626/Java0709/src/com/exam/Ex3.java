package com.exam;

public class Ex3 {
	public static void hello() {
		System.out.println("Hello Java");	
	}
		
	public static void sum(int a, int b) {
		System.out.printf("10 + 20 = %d\n", a + b);;  
	}
	
	public static int abs(int a) {
		if (a <= 0) {
			a *= -1;
		}
		return a;
	}
	
	public static int myMax(int a, int b) {
		int m  = 0;
		if(a < b) {
			m = b;
		}else {
			m = a;
		}
		return m;
	}
	
	public static int mySum(int a) {
		int s = 0;
		for(int i = 1; i<=a; i++) {
			s += i;
		}
		return s;
	}
	
	public static int[] sumArr(int iArr[]) {
		int s[] = new int[2];
		for(int i = 0; i<iArr.length; i++) {
			s[0] += iArr[i];
		}
			s[1] = s[0] / iArr.length;
		return s;
	}
	
	public static void main(String[] args) {
	int [] iArr = {80,70,68};
	hello();
	sum(10, 20);
	System.out.println("-5의 절대값 : " + abs(-5));
	System.out.println("10과 20중 큰 수는 : " + myMax(10,20));
	System.out.println("1 ~ 10 까지의 합 : " +mySum(10));
	System.out.println("배열 내부의 합 : " + sumArr(iArr)[0]);
	System.out.println("배열 내부의 평균 : " + sumArr(iArr)[1]);
	
	
	
	
	}

}
