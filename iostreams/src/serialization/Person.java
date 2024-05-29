package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
		private static final long serialVersionUID = 1L;
	

	private String name;
	private int age;
	
	
	private transient String password; 
	
	
	Person(String name, int age, String password){
		
		this.name= name;
		this.age=age;
		this.password=password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	

}
