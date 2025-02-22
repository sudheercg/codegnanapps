package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("Original list" + list);

		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer i = (Integer) iterator.next();
			// System.out.println(i);
			if (i % 2 == 0) {
				//System.out.println(i);
			} else {
				iterator.remove();
			}
		}
		System.out.println("Updated List: " + list);

	}

}
