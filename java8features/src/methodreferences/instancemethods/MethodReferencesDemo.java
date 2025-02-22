package methodreferences.instancemethods;

public class MethodReferencesDemo {

	public void doSomething() {
		System.out.println("Using method reference");
	}

	public void anotherMethod() {
		System.out.println("Using another method reference");
	}

	public static void main(String[] args) {

		// Lambda function
		MyInterface m = () -> System.out.println("Using Lambda expression implementation");
		m.myMethod();

		// Using Method References
		MethodReferencesDemo md = new MethodReferencesDemo();
		MyInterface m1 = md::doSomething;
		MethodReferencesDemo md3 = new MethodReferencesDemo();
		MyInterface m4 = md::anotherMethod;

		m1.myMethod();

		// Using Method References
		MethodReferencesDemo md1 = new MethodReferencesDemo();
		MyInterface m2 = md::anotherMethod;
		m1.myMethod();

	}

}
