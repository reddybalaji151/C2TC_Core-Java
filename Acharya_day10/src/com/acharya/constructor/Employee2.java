package com.acharya.constructor;

public class Employee2 {
	int id;
	String name;
	float salary;
	//Constructor
	Employee2(){
		System.out.println("User defined No-arg constructor is called");
	}
	//User defined parameterized constructor
	public Employee2(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1 = new Employee2(111,"reddy",5000f);
	     Employee2 e2 = new Employee2();
	     e1.display();
	     e2.display();


	}

}
