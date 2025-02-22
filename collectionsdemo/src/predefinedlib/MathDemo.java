package predefinedlib;

public class MathDemo {
	
	
	public static void main(String[] args) {
		
		//To find the maximum of 2 numbers
		int maxValue = Math.max(45, 43);
		System.out.println("Maximum of 45 and 43: "+maxValue);
		
		//To find the sqaure root of a number
		double sqrtValue = Math.sqrt(81); 
		System.out.println("Square root of 81: "+sqrtValue);
		
		//To find the power of a number
	   double powervalue =  Math.pow(2,3);
       System.out.println("2 raised to the power of 3: "+ powervalue);
       
       //To round a number
       long roundedValue = Math.round(6.7);
       System.out.println("Rounded Value of 6.7: "+roundedValue);
       
       //Random Value
       double randomValue = Math.random();
       System.out.println("Randomly generated Value: "+randomValue);
       
       //Trigonometric functions
       double sinValue = Math.sin(Math.toRadians(30));
       double cosValue= Math.cos(Math.toRadians(30));
       double tanValue= Math.tan(Math.toRadians(30));

       
       
       
       
		
		
		
	}

}
