package java8interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	
	public static void main(String[] args) {
		
		Consumer<Integer> squareConsumer  = x-> System.out.println(x*x);
		Consumer<Integer> cubeConsumer  = x-> System.out.println(x*x*x);
		squareConsumer.accept(10);
		cubeConsumer.accept(10);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		for(Integer number: numbers) {
			squareConsumer.accept(number);
		}
		
	}
	
}
