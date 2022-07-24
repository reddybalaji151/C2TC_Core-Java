
public class CharAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		char ch = str.charAt(2);
		System.out.println(ch);
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(-1));

	}

}
/* v
a
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1512)
	at CharAT.main(CharAT.java:10)
*/