package com.acharya.statickeyword;

public class Static2 {
	int rollno;
	String name;
	static String collage="AIT";
	Static2(int r,String n){
		rollno = r;
		name = n;
	}
	static void change() {
		collage = "ait";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+collage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static2 s1 = new Static2(111,"reddy");
		Static2 s2 = new Static2(222,"banu");
		change();
		s1.display();
		s2.display();

	}

}
