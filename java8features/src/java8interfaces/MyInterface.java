package java8interfaces;

interface MyInterface {

	public void myAbstractMethod();

	// concrete method -default

	default void myDefaultMethod() {
		System.out.println("In default method of Interface");
	}

	static void myStaticMethod() {

		System.out.println("Static method in Interface");

	}

}
