class Animal2
{
   void eat()
   {
   	System.out.println("Eating...");
   }
}
class Dog2 extends Animal2
{
   void bark()
   {
   	System.out.println("Braking...");
   }
}
class Cat extends Animal2
{
    void meaow()
    {
   	 System.out.println("Meaowing...");
    }
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a=new Animal2();
		Animal2 a1=new Dog2();
		Animal2 a2=new Cat();
		Dog2 d=new Dog2();
		Cat c=new Cat();
		a.eat();
		a1.eat();
		a2.eat();
		d.bark();
		c.meaow();

	}

}
