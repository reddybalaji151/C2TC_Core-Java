package com.acharya.generic;

class DataGenerics<T>{
	private T str;

	public T getStr() {
		return str;
	}

	public DataGenerics(T str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "DataGenerics [str=" + str + ", getStr()=" + getStr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

public class Generic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataGenerics<Character> obj = new DataGenerics<>('c');
		String output = (String)obj.getStr();
		System.out.println(output);


	}

}
