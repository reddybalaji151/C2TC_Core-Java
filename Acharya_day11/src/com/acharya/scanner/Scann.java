package com.acharya.scanner;

import java.util.*;

public class Scann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		System.out.println("name :"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Mobile number:"+mobileNo);
		System.out.println("CGPA:"+cgpa);

	}

}
