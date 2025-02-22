package com.codegnan.studentapp.util;

import java.util.ArrayList;

public class BoxingDemo {

	public static void main(String[] args) {

		int num = 10;
		Integer wrappedNumber = num;//Autoboxing int to Integer. 
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(num);
		
		int num1 = list.get(0); // Autounboxing of Integer to int. 
		
		System.out.println(num1);

	}

}
