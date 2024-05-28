package functionalifaces.function.chaining;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = i -> 2*i;
		
		Function<Integer,Integer> f2 = i -> i*i;
		
		//applying f1.andThen(f2)
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.andThen(f2).apply(10));
		
		//applying f1.compose(f2)
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f1.compose(f2).apply(10));
		
	}

}
