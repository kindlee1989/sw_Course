package com.exam;

class Tree{
	//필드
	String name;
	int age;
	void wave() {
		System.out.println(name + "가 바람에 흔들린다.");
	}
}



public class Ex4 {

	public static void main(String[] args) {

		int a = 0;
		int arr[] = new int[5];
		
		Tree tree;  
		tree = new Tree();
		tree.name = "소나무";
		tree.age = 100;
		System.out.println(tree.name);
		System.out.println(tree.age);
		tree.wave();
		
		Tree tree2 = new Tree();
		tree2.name = "대나무";
		tree2.age = 10;
		System.out.println(tree2.name);
		System.out.println(tree2.age);
		tree2.wave();
		
		
		
		Tree tree3 = null;
		tree3.name = "버드나무";
		
	}

}
