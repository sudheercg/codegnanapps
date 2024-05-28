package functionalifaces.consumer.chaining;

import java.util.function.Consumer;

//Hello World! 

public class ConsumerChainingDemo {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("!");

		Consumer<StringBuilder> c1 = s -> s.append(" World");
		Consumer<StringBuilder> c2 = s -> s.insert(0, "Hello");
		Consumer<StringBuilder> c3 = s -> System.out.println("Final Output: " + s);
		
        Consumer<StringBuilder> chainedConsumer = c1.andThen(c2).andThen(c3);
        chainedConsumer.accept(stb);
        
        
	}

}
