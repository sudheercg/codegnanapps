package com.codegnan.studentapp.util;

public class TestPrinter {

	public static void main(String[] args) {

		/*
		 * IntegerPrinter iPrinter = new IntegerPrinter(10);
		 *  iPrinter.print();
		 */
		Printer<Integer> iPrinter = new Printer<>(20);
		iPrinter.print();
		
		
		/*
		 * 
		 * StringPrinter sPrinter = new StringPrinter("MySTring"); 
		 * sPrinter.print();
		 * 
		 */
		Printer<String> sPrinter = new Printer<>("Hyderabad");
		sPrinter.print();
		
		 /** 
		 * 
		 * DoublePrinter dPrinter = new DoublePrinter(233.456); dPrinter.print();
		 */
		Printer<Double> dPrinter = new Printer<>(200.345);
		dPrinter.print();
	*/	
	}

}
