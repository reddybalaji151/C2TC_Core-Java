package com.acharya.string_inbulit_methods;

public class StrInbMet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is the last index of example";
		int index = str.lastIndexOf("last");
		System.out.println(index);
		index=str.lastIndexOf("of",25);
		System.out.println(index);
		index=str.lastIndexOf("of",10);
		System.out.println(index);

	}

}
/*Output:
12
23
-1
*/