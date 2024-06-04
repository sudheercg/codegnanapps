package wrapperclasses;

import java.util.ArrayList;

public class AutoBoxingDemo {
	
	public static void main(String[] args) {
		
		//Autoboxing: converting primitive to Object
		Integer intObj =100; //Autoboxing of int
		Double doubleObj = 3.14;
		Character charObj='a';
		
		ArrayList al = new ArrayList();
		al.add(intObj);
		al.add(doubleObj);
		al.add(charObj);
		
		//Autounboxing
		int primitiveint = intObj;
		double primitivedouble = doubleObj;
		char primitiveChar = charObj;
		
		
		
		
		
	}

}
