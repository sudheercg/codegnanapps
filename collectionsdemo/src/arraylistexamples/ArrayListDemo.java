package arraylistexamples;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

	Fruit kiwi= new Fruit("Kiwi","Brown");
		
		ArrayList<Fruit> fruitsList = new ArrayList<>();
		fruitsList.add(new Fruit("Apple","Red"));
		fruitsList.add(new Fruit("Banana","yellow"));
		fruitsList.add(new Fruit("Orange","Orange"));
		fruitsList.add(new Fruit("Guava","Green"));
		fruitsList.add(kiwi);
		
		/*
		 * for(int i =0; i<fruitsList.size(); i++) {
		 * System.out.println(fruitsList.get(i)); }
		 */
		
		for(Fruit fruit:fruitsList) {
			System.out.println(fruit);
		}
		
		//Removing an element from fruitsList
		
		fruitsList.remove(kiwi);
		System.out.println();
		System.out.println("After removing Kiwi");
		System.out.println(fruitsList);
		for(Fruit fruit:fruitsList) {
			System.out.println(fruit);
		}
		
		System.out.println(fruitsList.size());
		System.out.println(fruitsList.contains(kiwi));
		
		System.out.println(fruitsList.get(0));
		System.out.println();
		
		//set method will replace the element at a specified index. 
		fruitsList.set(0, new Fruit("Pineapple","Brown"));
		
		fruitsList.add(0, new Fruit("Cherry","Red"));

		for(Fruit fruit:fruitsList) {
			System.out.println(fruit);
		}
		
		/*
		 * fruitsList.clear(); System.out.println("After clearing"); for(Fruit
		 * fruit:fruitsList) { System.out.println(fruit); }
		 */
		
		
		
		
		
		
		
		
		
	}

}
