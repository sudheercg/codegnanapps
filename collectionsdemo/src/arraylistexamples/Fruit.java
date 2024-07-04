package arraylistexamples;

public class Fruit {
	
	private String fruitName;
	private String fruitColor;
	
	public Fruit(String fruitName, String fruitColor) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	
	
	  @Override public String toString() { return "FruitName=" + fruitName +
	  ", FruitColor=" + fruitColor ; }
	 

}
