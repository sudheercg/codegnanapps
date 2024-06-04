package generics;

public class Main {

	public static void main(String[] args) {

		GenericPrinter<String> sPrinter = new GenericPrinter<>("CodeGnan");
		System.out.println(sPrinter.print());
		
		GenericPrinter<Integer> iPrinter = new GenericPrinter<>(3000);
		System.out.println(iPrinter.print());
		
		GenericPrinter<Double> dPrinter = new GenericPrinter<>(300.567);
		System.out.println(dPrinter.print());


	}
}
