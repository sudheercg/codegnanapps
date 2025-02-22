package maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithComparator {

	public static void main(String[] args) {

		// Custom sorting using Comparator to get the entries in reverse sorted order

		Comparator<Integer> reverseOrderComparator = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {

				// return Integer.compare(o2, o1);
				return o2.compareTo(o1);
			}

		};

		TreeMap<Integer, String> treeMap = new TreeMap<>(reverseOrderComparator);
		treeMap.put(3, "Three");
		treeMap.put(2, "Two");
		treeMap.put(1, "One");
		treeMap.put(4, "Four");

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ":" + "Valuye: " + entry.getValue());
		}

	}

}
