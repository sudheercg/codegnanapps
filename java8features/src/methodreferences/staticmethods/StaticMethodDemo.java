package methodreferences.staticmethods;

public class StaticMethodDemo {

	public static void myStaticMethod() {

		System.out.println("Method referencing a static method");

	}

	public static void main(String[] args) {

		MyInterface m = StaticMethodDemo :: myStaticMethod;
		m.myMethod();
		

	}

}
