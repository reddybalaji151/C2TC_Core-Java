package com.acharya.statickeyword;

public class Student1 {
	int rollno;
	String name;
	static String college = "ITS";
	Student1(int r, String n)
	{
		rollno = r;
		name = n;
	}
	static void change() {
		college = "BBDIT";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(111,"reddy");
		Student s2 = new Student(23,"reddappa");
		change();
		s1.display();
		s2.display();

	}

}
