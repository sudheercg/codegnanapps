package streamsapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo02 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Kumar", 20, "Sales"),
				new Employee("Shekhar-", 22, "Finance"), new Employee("Raj", 25, "Engineering"),new Employee("Krishna", 25, "Engineering"));
		
		/*
		 * employees.stream().filter(name-> name.start)forEach(System.);
		 */
		
		
		employees.stream().forEach(System.out::println);
		
		
		
		
	}

}
