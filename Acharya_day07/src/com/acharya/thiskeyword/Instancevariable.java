package com.acharya.thiskeyword;

class Student{
	
	int rollno;
	String name;
	float fee;
	
	public Student(int rollno, String name, float fee) {
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno+" "+ name+" "+fee);
	}
}

public class Instancevariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(111,"reddy",55000f);
		Student s2=new Student(111,"reddy",55000f);
		s1.display();
		s2.display();

	}

}
