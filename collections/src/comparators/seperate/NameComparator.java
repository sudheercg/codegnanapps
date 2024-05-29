package comparators.seperate;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
 
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}