package com.acharya.string_inbulit_methods;

public class StrInbMeth4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Great",t="H";
		String u =s.concat(t);
		if(u==s) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		String e = s+t;
		if(e==s) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}

	}

}
/*Output:
Not same
Not same
*/