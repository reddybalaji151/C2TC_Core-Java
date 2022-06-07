
public class Company {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		Company c1 = c;
		c1.name = "C2TC";
		c = null;
		//System.out.println(c.name);
		// Cannot read field "name" because "c" is null
		System.out.println(c1.name);

	}

}
