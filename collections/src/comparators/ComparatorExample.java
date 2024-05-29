package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, 160));
        people.add(new Person("Bob", 25, 175));
        people.add(new Person("Charlie", 35, 180));

        // Comparator for sorting by name
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(people, nameComparator);
        System.out.println("Sorted by name:");
        System.out.println(people);

        // Comparator for sorting by age
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        Collections.sort(people, ageComparator);
        System.out.println("\nSorted by age:");
        System.out.println(people);

        // Comparator for sorting by height
        Comparator<Person> heightComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.getHeight(), p2.getHeight());
            }
        };
        Collections.sort(people, heightComparator);
        System.out.println("\nSorted by height:");
        System.out.println(people);
    }
}