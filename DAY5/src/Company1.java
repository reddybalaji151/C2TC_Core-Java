
public class Company1 {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company1 c1 = new Company1();
		c1.name = "C2TC";
		Company1 c2=c1;
		c1 = null;
		System.out.println(c2.name);
		//new Company1();
		//Company1 c3;
		//The local variable c3 may not have been initialized
		Company1 c3 = new Company1();
		c3.name = "c2TC";
		System.out.println(c3.name);
		

	}

}
