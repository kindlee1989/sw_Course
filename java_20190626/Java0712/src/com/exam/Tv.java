package com.exam;

public class Tv {
	 // 필드(멤버변수)
	 // 전원 boolean형 power
	 // 채널  정수형        channel
	 
	 // 메소드
	 // 전원켜기 끄기   powerOnOff()
	 // false -> true -> false 
	
	 // 채널1증가 channelUp()
	 
	 // 채널1감소 channelDown()
	
	boolean power;
	int channel;
	
	Tv (){
		System.out.println("tv를 가져왔습니다.");
		power = true;
		channel = 50;
	}
	
	void powerOnOff() {
		 power = !power;
		 
	}
	
	void channelUp() {
		channel ++;
	}
	
	void channelDown() {
		channel --;
	}
	
	
	
	
}
