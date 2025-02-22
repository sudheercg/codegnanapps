package arraylistexamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList namesList = new ArrayList();

		namesList.add("Sam");
		namesList.add("Ram");
		namesList.add("tim");

		System.out.println(namesList);

		ListIterator ltr = namesList.listIterator();

		
		System.out.println("Forward Iteration");
		//forward iteration
		while (ltr.hasNext()) {

			String name = (String) ltr.next();

			/*
			 * if (name.equals("tim")) { ltr.remove(); }
			 */
		System.out.println(name);	

		}
	
	
		
		// Backward iteration
		System.out.println();
		System.out.println("Backward Iteration");
		while(ltr.hasPrevious()) {
			String name = (String) ltr.previous();
			System.out.println(name);
		}
		
		
		

	}

}
