package wrapperclasses;

public class Demo01 {

	int myInt;
	String myString;
	Integer i;

	public static void main(String[] args) {

		Demo01 d = new Demo01();
		System.out.println(d.myInt);

		System.out.println(d.myString);
		System.out.println(d.i);

		// Boxing : Conversion of a primitive to an Object type
		// primitive
		int i = 550;
		// Object
		// Integer intObj = new Integer(i);

		// Autoboxing
		Integer intObj = i;

		// Unboxing : Conversion of an Object type to a primitive type
		// int j = intObj.intValue();

		// Autounboxing : Conversion of primitive type to object type.
		int j = intObj;

	}

}
