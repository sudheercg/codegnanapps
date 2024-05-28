package functionalifaces;

public class FunctionalImpl {

	public static void main(String[] args) {

		FunctionalIface f;
		f= () ->System.out.println("hello");
		
		f.doSomething();
		
		//accessing a default method of an Interface
		f.myDefaultMethod();
		
		//Accessing a static method of an interface
		FunctionalIface.myStaticMethod();
		
	   }

}
