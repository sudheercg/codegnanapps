package functionalifaces;

@FunctionalInterface
interface FunctionalIface {
	
	//Single Abstract method
	public void doSomething();
	
	//default methods
	//static methods
	
	default void myDefaultMethod() {
			System.out.println("This is "
					+ "a default method");
	}
	
	static void myStaticMethod() {
		System.out.println("This is a "
				+ "static method");
	}
	

}
