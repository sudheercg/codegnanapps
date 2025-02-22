package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Apple", 10);
		map.put("Banana", 12);
		map.put("Guava", 44);
		map.put("Kiwi", 10);
		map.put("Mango", 10);

		// Retrieve a value of a particular key - get(key)

		System.out.println(map.get("Apple"));

		// Check whether a key exists
		System.out.println(map.containsKey("Basnaa"));

		String[] strArr = new String[2];
		
		for(String str:strArr) {}
		
		
		
		// Iterate over the entries of map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println("Key: " + entry.getKey() + "," + "Value: " + entry.getValue());
		}
		
		Set<String> set = map.keySet();
		for(String key: set ) {
			System.out.println("Key: "+key);
		}
		
		Collection<Integer> values = map.values();
		for(Integer value: values) {
			System.out.println("Value: "+value);
		}
	
	}

}
