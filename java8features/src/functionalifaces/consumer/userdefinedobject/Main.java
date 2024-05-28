package functionalifaces.consumer.userdefinedobject;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Consumer<Employee> empConsumer;
		empConsumer=  employee -> System.out.println("Employee Name: "+employee.name);
		
		Employee emp = new Employee("Sai");
		empConsumer.accept(emp);
	}

}
