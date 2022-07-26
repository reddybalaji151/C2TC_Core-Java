package com.acharaya.features;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//external iterators
		//for loop
		for(int i=0;i<6;i++) {
			System.out.println(list.get(i));
		}
		//Iterators
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//enhanced for loop
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//internal iterators
		//for each method
		list.forEach(values ->System.out.println(values));

	}

}
