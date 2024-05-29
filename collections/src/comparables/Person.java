package comparables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo method to sort by age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort the list based on age
        Collections.sort(people);

        // Print the list after sorting
        System.out.println("After sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
