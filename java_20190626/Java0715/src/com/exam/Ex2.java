package com.exam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		

		
		
		
		Animal 동물1=new Animal();
		동물1.run();
		Animal 동물2=new Animal("다정");
		동물2.run();
		Animal 동물3=new Animal(31);
		동물3.run();
		Animal 동물4=new Animal("다정", 31);
		동물4.run();
		
		
		
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은" + me.average());
		
		scanner.close();
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴" );
		song.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
