package stringsdemo;

public class StringImmutableDemo {
	
	public static void main(String[] args) {
		
		String myString ="CodeGnan";
		myString.concat(" Hyderabad");// A new String object gets created.
		System.out.println(myString);
		
		
		StringBuilder institute = new StringBuilder("CodeGnan");
		institute.append(" Hyderabad");
		System.out.println(institute);
		
		StringBuffer strBuffer = new StringBuffer("Hello");
		strBuffer.append(" World");
		System.out.println(strBuffer);
		
		
		
		
	
	}

}
