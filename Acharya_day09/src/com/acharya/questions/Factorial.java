package com.acharya.questions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;

		int factorial = 1;

		for(int i = 2; i <= number; i++ )

		{

		factorial *= factorial;

		}
//String literal is not properly closed by a double-quote
		System.out.println("Factorial of 5:” + factorial);

	}

}
