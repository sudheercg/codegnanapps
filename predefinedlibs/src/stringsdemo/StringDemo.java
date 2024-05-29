package stringsdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		//String literal
		String myString1 ="CodeGnan";
		String myString2 ="CodeGnan";
		
		//reference comparision 
		System.out.println(myString1 == myString2);//true
		//content comparision
		System.out.println(myString1.equals(myString2));//true
	
		
		//Using a new keyword
		String myString3 = new String("CodeGnan");//xyz
		String myString4 = new String("CodeGnan");//ssd
		
		System.out.println(myString3 == myString4);//false
		System.out.println(myString3.equals(myString4));//true
		
		
		
	
		
		
		
		
		
	}
	
	
}
