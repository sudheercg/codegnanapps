package wrapperclasses;

import java.util.ArrayList;

public class Demo02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Banana");
		/*
		 * list.add(100); list.add(true);
		 */
		
		System.out.println(list.get(0));
		String fruit = (String)list.get(0);
		
		
	}
	
	
	
	

}
