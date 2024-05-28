package functionalifaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		//Define a consumer that takes an integer and calculate the cube
		Consumer<Integer> squareConsumer  = x -> System.out.println(x*x*x);
		
		//List of Integers
		
	    List<Integer> numbers=  Arrays.asList(1,2,3,4,5);
	    
	    //Use the Consumer to print the square of each number
	    
	    for(Integer number: numbers) {
	    	squareConsumer.accept(number);
	    }
	    
	    
	    
		
		
		
		
	}

}
