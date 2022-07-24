package com.acharya.string_inbulit_methods;

public class StrInbMeth5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is the example";
		int index = s1.indexOf("example",10);
		System.out.println(index);
		index = s1.indexOf("example",20);
		System.out.println(index);

	}

}
/*Output:
12
-1
*/