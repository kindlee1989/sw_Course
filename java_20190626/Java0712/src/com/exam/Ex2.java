package com.exam;





public class Ex2 {
	
	public static void main(String[] args) {
		

		// Tv 객체 생성 tv
		Tv tv;
		tv = new Tv();
		
		// powerOnOff() 메소드 호출
		tv.powerOnOff();
				
		// 전원상태값 출력 power
		System.out.println(tv.power);
		
		
		// 메소드호출로 채널 1 증가
		tv.channelUp();
		
		// 메소드호출로 제널 1 증가
		tv.channelUp();
		// 현재 채널값 출력
		System.out.println(tv.channel);
		// 메소드호출로 채널 1 감소
		tv.channelDown();
		// 현재 채널값 출력
		System.out.println(tv.channel);
		
		
		
		
		
		
	}// main

}
