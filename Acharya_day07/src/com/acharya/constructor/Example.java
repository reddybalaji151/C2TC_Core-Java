package com.acharya.constructor;

class Employee{
	int id;
	String name;
	float salary;
	
	public Employee(int i, String n, float f) {
		// TODO Auto-generated constructor stub
		id =i;
		name =n;
		salary =f;
		
	}

	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(11,"reddy",50000f);
		Employee e2 = new Employee(222,"banu",50000f);
		e1.display();
		e2.display();

	}

}
