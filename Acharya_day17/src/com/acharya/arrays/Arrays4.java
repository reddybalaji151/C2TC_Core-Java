package com.acharya.arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{43,2,23},{5,60,12},{19,10,1}};
		function(array);

	}
	public static void function(int array[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}

	}

}
/*Output: 
43 5 19 
2 60 10 
23 12 1 
*/