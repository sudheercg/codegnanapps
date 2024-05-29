package comparators.seperate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
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

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + '}';
	}
}