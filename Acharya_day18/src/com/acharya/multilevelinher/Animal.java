package com.acharya.multilevelinher;

public class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();

	}

}
