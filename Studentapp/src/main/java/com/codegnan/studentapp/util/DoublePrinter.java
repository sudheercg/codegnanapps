package com.codegnan.studentapp.util;

public class DoublePrinter {
     
	double doubleVar;
	Double thingToPrint ;
	
	DoublePrinter(Double thingToPrint ){
		this.thingToPrint=thingToPrint;;
	}

	public void print() {
		System.out.println(thingToPrint);
	}
}
