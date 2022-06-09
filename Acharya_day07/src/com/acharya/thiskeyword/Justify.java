package com.acharya.thiskeyword;

class Student1{
	void display() {
		System.out.println(this);
		System.out.println("In display method");
	}
}

public class Justify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		Student1 s2 = new Student1();
		System.out.println(s1);
		s2.display();

	}

}
