package com.acharya.arrays;

import java.util.*;

public class Arrays6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr_size = in.nextInt();
		int arr[] = new int[arr_size];
		int i;
		for(i=0;i<arr_size;i++) {
			arr[i] = in.nextInt();
		}
		int search_elem=in.nextInt();
		int count = 0;
		for(i=0;i<arr_size;i++) {
			if(arr[i]==search_elem) {
				count++;
			}
		}
		System.out.println(count);
		in.close();

	}

}
