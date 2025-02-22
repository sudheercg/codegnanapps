package com.codegnan.studentapp.util;

//Generic Printer class which can work with any Type
public class Printer <X> {

	X thingToPrint;

	public Printer(X thingToPrint) {
       this.thingToPrint=thingToPrint;
	}
	
  public void print() {
	  System.out.println(thingToPrint);
  }
}
