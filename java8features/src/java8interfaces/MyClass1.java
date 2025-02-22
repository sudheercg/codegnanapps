package java8interfaces;

public class MyClass1 implements MyInterface {

	
	@Override
	public void myAbstractMethod() {
		System.out.println("This is an abstrct method");
		
	}
	
	public void myDefaultMethod() {
		
		System.out.println("Overridden default method");
	}

	public static void main(String[] args) {
		MyClass1 m1 = new MyClass1();
		m1.myAbstractMethod();
		m1.myDefaultMethod();
		MyInterface.myStaticMethod();
		
	}

}
