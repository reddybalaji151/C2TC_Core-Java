
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		System.out.println("---Printing object values---");
		System.out.println("Byte object: "+byteobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Integer object: "+intobj);
		System.out.println("Long object: "+longobj);
		System.out.println("Float object: "+floatobj);
		System.out.println("Double oject: "+doubleobj);
		System.out.println("Character object: "+charobj);
		System.out.println("Boolean object: "+boolobj);
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		System.out.println("---Printing primitive value---");
		System.out.println("byte value: "+bytevalue);
		System.out.println("short value: "+shortvalue);
		System.out.println("int value: "+intvalue);
		System.out.println("long value: "+longvalue);
		System.out.println("float value: "+floatvalue);
		System.out.println("double value: "+doublevalue);
		System.out.println("char value: "+charvalue);
		System.out.println("boolean value: "+boolvalue);

	}

}
//output
/*---Printing object values---
Byte object: 10
Short object: 20
Integer object: 30
Long object: 40
Float object: 50.0
Double oject: 60.0
Character object: a
Boolean object: true
---Printing primitive value---
byte value: 10
short value: 20
int value: 30
long value: 40
float value: 50.0
double value: 60.0
char value: a
boolean value: true*/
