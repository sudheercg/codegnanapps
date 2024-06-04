package wrapperclasses;

public class WrapperDemo {

	public static void main(String[] args) {
		//boxing
		Integer intObj = new Integer(5566);    // wrap an int to Integer by    constructing an instance of Integer
		//unboxing
		int i = intObj.intValue();             // unwrap Integer to int
		 
		Double doubleObj = new Double(55.66);  // wrap double to Double
		double d = doubleObj.doubleValue();    // unwrap Double to double

		Integer intObj1 = 5566;
		int i1 = intObj1;
		
		//parInt
		String str="512";
		//error in the below because it cant
		//int j = str * 2;
		int i2 = Integer.parseInt(str);
		System.out.println(i2*2);
		
	}

}
