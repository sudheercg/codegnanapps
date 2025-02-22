package java8interfaces;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		FunctionalIface01 f;
		//f=   () ->System.out.println("Hello");
		//f.print();
		
		f= (i,j)->i+j;
		int i =f.sum(20,30);
		System.out.println(i);
		       
		     	
		
	}

}
