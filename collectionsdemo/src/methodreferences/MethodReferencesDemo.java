package methodreferences;

public class MethodReferencesDemo {
	
	public void doSomething() {
		System.out.println("Using doSomething Implementation");
	}
	
	public void doSomethingElse() {
		System.out.println("Using doSomethingElse implementation");
	}
	
	public static void main(String[] args) {
		
		//Using a Lambda expression
		MyIface m = ()->System.out.println("Using Lambda "
				+ "expression implementation");
		m.myMethod();
		
		MethodReferencesDemo md = new MethodReferencesDemo();
		MyIface m2 = md::doSomething;
		m2.myMethod();
		
		MethodReferencesDemo md1 = new MethodReferencesDemo();
		MyIface m3 = md1::doSomethingElse;
		m3.myMethod();
		
		
		
		
		
		
	}

}
