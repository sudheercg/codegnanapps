package streamsapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		
		List<Integer> numbersList =  Arrays.asList(1,2,3,4,5);
		
		int sum = numbersList.stream().reduce(0, Integer :: sum);
		System.out.println(sum);//Output: 15
		
		

	}

}
