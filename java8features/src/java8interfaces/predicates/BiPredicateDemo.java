package java8interfaces.predicates;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer>  isSumEven = (a,b)-> (a+b)%2 == 0;
		//Test the BiPredicate
		int x=10;
		int y = 2;
		
		boolean result = isSumEven.test(x, y);
		System.out.println(result);
		
		
	}
}
