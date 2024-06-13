package abstraction.interfaces;

public class Square implements Shape{
	
	double side; 
	
	Square(double side){
		this.side=side; 
	}
	
	
	public double calculateArea(){
		
		return side * side; 
		
	}

}
