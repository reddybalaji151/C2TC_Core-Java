
public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "The walking Dead";
		String s2 = "The walking Dead";
		String s3 = "THE WALKING DEAD";
		String s4 = "The WEST WEEDS";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
/*Output:
true
true
false
*/