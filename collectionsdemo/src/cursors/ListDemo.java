package cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

		 
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));

		
		 /* for (String element : list) {
			  if (element.equals("two")) {
		  }
		  list.remove(element); // This will cause ConcurrentModificationException } }
*/		 

       Iterator iterator = list.iterator();
       
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
       }
       
    }
}
