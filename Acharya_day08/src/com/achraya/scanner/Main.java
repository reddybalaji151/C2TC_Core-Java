package com.achraya.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		double cgpa = sc.nextDouble();
		long mobileno = sc.nextLong();
		System.out.println("name"+name);
		System.out.println("gender"+gender);
		System.out.println("age" +age);
		System.out.println("cgpa"+cgpa);
		System.out.println("mobileno"+mobileno);

	}

}
