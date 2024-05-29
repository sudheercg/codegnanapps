package streamsapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		String strArray[] = { "Apple", "Banana", "Cherry" };
		
		//Creatinng a Stream using stream() method
		Stream stream1 = Arrays.stream(strArray);
		
		//Creating a Stream using of() method
		Stream stream2 = Stream.of(strArray);

	}

}
