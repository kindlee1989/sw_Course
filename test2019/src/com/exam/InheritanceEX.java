package com.exam;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}	
}


class Student extends Person{
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		//weight = 99;
		setWeight(99);		
	}	
}


public class InheritanceEX {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
