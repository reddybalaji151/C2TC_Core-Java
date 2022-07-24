
public class StrVsStrBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "study";
		str.concat("night");
		System.out.println(str);
		StringBuffer str1 = new StringBuffer("study");
		str1.append("night");
		System.out.println(str1);

	}

}
/*Output:
study
studynight
*/