package java8interfaces.predicates;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		// Create a Predicate
		Predicate<Integer> p;

		p = i -> i > 20;
		
		System.out.println(p.test(30));
		
		
		Predicate<Integer> evenOrOddCheck;
		evenOrOddCheck = number -> number %2 ==0;
		
		System.out.println(evenOrOddCheck.test(33));

	}

}
