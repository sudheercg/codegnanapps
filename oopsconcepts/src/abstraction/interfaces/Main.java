package abstraction.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(5.2);
		double area= circle.calculateArea();
		System.out.println(area);
		
		
		System.out.println();
		Square square = new Square(10);
		double squareArea = square.calculateArea();
		System.out.println(squareArea);
		
	}

}
