package com.exam;

// 생성자 오버로딩(Overloading) : 생성자 여러개 정의

// 생성자 정의부는 생성된 객체의 구성요소로 포함안됨!

public class Point {
	 //필드(멤버변수) 정수형 x  정수형y
	private int x, y;	
	//기본생성자     x와 y를 2로 초기화
	public Point() {
		x = 2; // x = y = 2; 로 써도됨
		y = 2;
	}
	
	// 정수값 받아서 x필드를 초기화 
	public Point(int _x) {
		x = _x;
	}
	//정수값 두개 받아서 x와 y필드를 초기화
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	// x필드에 값 설정하는 setter 메소드 (쓰기)
	void setX(int _x) {
		if (_x < 0) {
			x = 0;
		}else {
			x = _x;
		}
		
	}
	
	// y필드에 값 설정하는 setter 메소드
	void setY(int _y) {
		if (_y < 0) {
			y = 0;
		}else {
			y = _y;
		}
		
	}

	// x필드값 가져오기 getter메서드(읽기)
	int getX(){
		return x;
	}

	// y필드값 가져오기 getter메서드(읽기)
	int getY(){
		return y;
	}
	
	

	//일반 메서드   출력 "x, y" / 리턴값 없으면 void에 
	void printData(){
		System.out.println(x + ", " + y);
	}
	
}
