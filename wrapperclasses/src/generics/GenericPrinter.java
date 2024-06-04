package generics;

public class GenericPrinter <T> {
	
	T thingToPrint;
	
	GenericPrinter(T thingToPrint){
		this.thingToPrint=thingToPrint;
	}

	public T print() {

		 return thingToPrint;
	}
	
	

}
