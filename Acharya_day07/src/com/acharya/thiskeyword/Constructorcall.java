package com.acharya.thiskeyword;

class Employee{
	
	Employee(){
		this(5);
		System.out.println("In employee no-arg");
	}
	Employee(int x){
		System.out.println(x);
	}
}

public class Constructorcall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();

	}

}
