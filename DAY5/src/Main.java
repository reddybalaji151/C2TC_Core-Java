
class Student{
	int rollno;
	String name;
	void insertrecord(int r,String n) {
		rollno = r;
		name = n;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.insertrecord(111, "reddy");
		System.out.println(s1.rollno+" "+s1.name);

	}

}
