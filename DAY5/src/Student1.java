
public class Student1 {
	int rollno;
	String name;
	void insertrecord(int r,String n) {
		rollno = r;
		name = n;
	}
	void Displayinformation() {
		System.out.println("rollno" +rollno+ " " + "name"+name);
	}

	public static void main(String args[]) {
		Student1 s1 = new Student1();
		s1.rollno = 101;
		s1.name = "John";
		s1.Displayinformation();
		//System.out.println(s1.rollno+" "+s1.name);
	}
}

	