package com.acharya.codesnippet;

public class BreakNestedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) //1, 2 , 3

		{

		for(int j=1;j<=3;j++) //1 2

		{

		if(i==2&&j==2){

		break; //forceful termination on inner for loop

		}

		System.out.println(i+" "+j);
		}

	}

}}
