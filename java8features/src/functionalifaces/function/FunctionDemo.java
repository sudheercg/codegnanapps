package functionalifaces.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		//finding the square of a number
		Function<Integer, Integer> f;
		f= i -> i*i;
		
		//display result
		System.out.println(f.apply(9));
		System.out.println(f.apply(23));


	}

}
