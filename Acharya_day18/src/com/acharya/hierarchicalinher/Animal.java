package com.acharya.hierarchicalinher;

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
class Cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		d.bark();
		c.eat();

	}

}
