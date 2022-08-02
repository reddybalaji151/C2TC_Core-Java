package com.acharya.generic;


class Dataa<K,V>{
	private K Key;
	private V Value;
	public K getKey() {
		return Key;
	}
	public V getValue() {
		return Value;
	}
	public Dataa(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	@Override
	public String toString() {
		return "Dataa [Key=" + Key + ", Value=" + Value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

public class Generic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dataa<Integer,String> obj = new Dataa<Integer,String>(1,"Reddy");
		System.out.println(obj.getKey());
		System.out.println(obj.getValue());


	}

}
