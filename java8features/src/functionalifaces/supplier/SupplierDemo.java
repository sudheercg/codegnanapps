package functionalifaces.supplier;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		//Define a supplier
		Supplier<Double> randomNumberSupplier = ()-> Math.random();
		
		//Get a random number for Supplier
		double randomNumber = randomNumberSupplier.get();
		
		//Print the random number
		System.out.println("Random Number: "+randomNumber); 
		
		
	}

}
