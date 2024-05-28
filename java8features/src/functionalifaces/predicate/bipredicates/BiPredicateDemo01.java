package functionalifaces.predicate.bipredicates;

import java.util.function.BiPredicate;

public class BiPredicateDemo01 {
	
	public static void main(String[] args) {
		
		//Defining a BiPredicate
		//Check if the sum of 2 numbers is even.
		
		BiPredicate<Integer,Integer> isSumEven = (a,b)-> (a+b)%2 ==0;
		
		//Testing the Bipredicate
		int x = 5;
		int y =3;
		boolean result = isSumEven.test(x, y);
		
		//Print the result
		System.out.println("Is the sum of "+x+ " and "+y+" even? "+ result);
		
		
		
	}

}
