package sortingdemo;

//The type Person must implement the
//inherited abstract method Comparable<Person>.compareTo(Person)

class Person implements Comparable<Person> {
	private String name;
	private int age;
	private double height;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	/* Person objects sorted based on age
	  public int compareTo(Person other) { 
	    return Integer.compare(this.age,other.age); 
	    }
	 */
	
	//Person object sorted based on name
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

	
	
	
	
	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + '}';
	}

}