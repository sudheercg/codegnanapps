package functionalifaces.predicate;

import java.util.function.Predicate;

public class PredicateDemo01 {

	public static void main(String[] args) {
		
		//Creating a Predicate
		Predicate<Integer> p;
		p= i->  (i<20);

		//to check whether a number is even or not
		Predicate<Integer> evenOrOdd;
		evenOrOdd = number -> number % 2== 0;
		
		
		//testing a predicate
		System.out.println(p.test(10));
		System.out.println(p.test(33));
		
		//testing evenOrOdd predicate
		System.out.println(evenOrOdd.test(2));
		
		
	}

}
