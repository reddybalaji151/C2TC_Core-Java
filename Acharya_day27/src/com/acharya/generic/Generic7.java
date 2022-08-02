package com.acharya.generic;

import java.util.ArrayList;
import java.util.List;

class Data1{
	public <E>void printListData(List<E>obj){
		for(E elements:obj) {
			System.out.println(elements);
		}
	}
}
public class Generic7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		Data1 data = new Data1();
		data.printListData(obj);

	}

}
