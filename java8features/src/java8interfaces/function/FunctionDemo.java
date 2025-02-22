package java8interfaces.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f;
		f = i -> i * i;

		System.out.println(f.apply(20));
		
		Function<String, Integer> stringLengthFunction; 
		stringLengthFunction = str-> str.length();
		
		String text = "Java";
		int length = stringLengthFunction.apply(text);
		System.out.println("The length of a given String \""+text+"\" is "+length);
		
	}
}
