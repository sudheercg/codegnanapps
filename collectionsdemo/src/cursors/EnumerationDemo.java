package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherrry");
		
		Enumeration<String> e = vector.elements();
		
		while(e.hasMoreElements()) {
			
		String element=	e.nextElement();
		System.out.println(element);
			
		}
		
	}

}
