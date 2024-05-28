package functionalifaces.function;

import java.util.function.Function;

public class FunctionIfaceDemo02 {

	public static void main(String[] args) {

		Function<String, Integer> stringLengthFunction;
		
		stringLengthFunction = str -> str.length();
		
		//Test the function
		
		String text =  "CodeGnan";
		
		int length = stringLengthFunction.apply(text);
		
		//Print the result
		System.out.println("The length of given String "+length);
		
		//The length of "CodeGnan" is 8
		System.out.println("Length of the String \""+ text + "\" is "+length);
	}

}
