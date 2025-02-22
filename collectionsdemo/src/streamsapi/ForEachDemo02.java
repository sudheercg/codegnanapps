package streamsapi;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo02 {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,5,3,10);
		
		//Filter even numbers and print each of them 
		//use filter() forEach();
		numbersList.stream().filter(number->number%2==0).forEach(number->System.out.println(number));
		}

}
