package com.acharaya.features;

import java.util.Arrays;
import java.util.List;

public class findfirst1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));

	}

}
