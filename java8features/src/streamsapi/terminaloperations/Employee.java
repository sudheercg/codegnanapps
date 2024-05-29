package streamsapi.terminaloperations;

public class Employee {

	String name;
	int age;
	String department;

	Employee(String name, int age, String department) {

		this.name = name;
		this.age = age;
		this.department = department;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}

}
