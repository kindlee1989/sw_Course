package com.exam;



// 클래스 정의 Book
//    책 제목   문자열   title  
//    책가격    정수형   price
//    책재고    정수형   num

//    책금액 총합   메소드 
//     정수형리턴  sum()
//         책가격  *  책재고수

class Book{
	String title;
	int price;
	int num;

	
	int sum() {
		int sum = price * num;
		return sum;
	}
	
	
	
	void 책금액() {
		System.out.println("책제목 " + title + "책가격 " + price + "재고 " + num);
		System.out.println("책금액 합계 " + sum());
	}
	
}


public class Ex1 {

	public static void main(String[] args) {
		// Book 사용 -> 객체생성 후 사용한다는 의미
		
		// 출력 "책제목 : java   가격 : 10,000   갯수 : 30"
		//     "총금액합계 : 300,000

		// 출력 "책제목 : html   가격 : 20,000   갯수 : 50"
		//     "총금액합계 : 1,000,000
		
		 Book book=new Book();
		 
		 book.title = "java";
		 book.price = 10000;
		 book.num = 30;
		 book.책금액();
		 
		 Book book1 = new Book();
		 
		 book1.title = "html";
		 book1.price = 20000;
		 book1.num = 50;
		 book1.책금액();
		 
		 
		 
		
		
		
		
		
	}// main

}
