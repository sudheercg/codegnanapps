package methodoverloading;

public class Calculator {

	// Method to add 2 integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add 3 integers

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public String add(String str, int sum) {
		return str+":"+ sum;
	}
	
	public void add(String text, int a, int b) {
		System.out.println(text + (a+b));
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println(calc.add(20, 30));
		System.out.println(calc.add(30,40,50));
		calc.add("Result of addition:", 40, 50);
		
	}

}
