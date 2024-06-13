package abstraction.interfaces;

public class Circle implements Shape{
	
	double radius; 
	
	Circle(double radius){
		this.radius = radius; 
	}
	
	public double calculateArea() {
		
		//Area of a circle : PI * R* R;
		
		double area = Math.PI * radius * radius;
		
		return area;
		
	}

	
	

}
