package com.exam;

public class Ex3 {
	
	/*
	 * public static int calc(String a, int b, int c) {
	
		int d = 0;
		if(a.equals("+")) {
			d = b + c;
		}else if(a.equals("-")) {
			d = b - c;
		}else if(a.equals("*")) {
			d = b * c;
		}else {
			d = b / c;
		}
		return d;
	}
 */	
	
	public static int calc(char a, int b, int c) {
		int d = 0;
		switch(a) {
		case '+' : d = b + c;
		break;
		case '-' : d = b - c; 
		break;
		case '*' : d = b * c; 
		break;
		case '/' : d = b / c; 
		break;
		}
		return d;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("20 + 10 = " + calc('+',20,10));
		System.out.println("20 - 10 = " + calc('-',20,10));
		System.out.println("20 * 10 = " + calc('*',20,10));
		System.out.println("20 / 10 = " + calc('/',20,10));
	}

}
