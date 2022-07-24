package com.acharya.constructor;

public class S1 {
	void m(S1 a) {
		System.out.println("method is invoked");
	}
	void p() {
		m(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 s1 = new S1();
		s1.p();

	}

}
