package functionalifaces.consumer.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		//Define a Binconsumer
		
		BiConsumer<String,Integer> c;
		c= (name,age) -> System.out.println("Name: "+name+ ", Age: "+age);
		
		c.accept("Sai", 22);
		
	
	}

}
