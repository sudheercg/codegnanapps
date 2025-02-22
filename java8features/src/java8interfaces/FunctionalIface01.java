package java8interfaces;

@FunctionalInterface
interface FunctionalIface01 {

	//public void print();

	public int sum(int arg1, int arg2);
	
	// concrete method -default

	default void myDefaultMethod() {
		System.out.println("In default method of Interface");
	}

	static void myStaticMethod() {

		System.out.println("Static method in Interface");

	}

}
