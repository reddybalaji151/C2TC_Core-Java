package com.acharya.string_inbulit_methods;

public class StrInbMet10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Jumanji";
		char[] ch=s1.toCharArray();
		int len=ch.length;
		System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.print(ch[i]);
		}

	}

}
/*Output
18
Welcome to Jumanji
*/