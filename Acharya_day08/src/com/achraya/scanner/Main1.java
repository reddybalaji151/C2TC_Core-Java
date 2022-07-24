package com.achraya.scanner;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String name = sc.nextLine();
		System.out.println("gender");
		char gender = sc.next().charAt(0);
		System.out.println("age");
		int age = sc.nextInt();
		System.out.println("cgpa");
		double cgpa = sc.nextDouble();
		System.out.println("mobileno");
		long mobileno = sc.nextLong();
		System.out.println("name"+name);
		System.out.println("gender"+gender);
		System.out.println("age" +age);
		System.out.println("cgpa"+cgpa);
		System.out.println("mobileno"+mobileno);

	}

}
