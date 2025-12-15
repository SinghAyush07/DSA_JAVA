// add duplicate element in set

import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ayush");
        set.add("Raghav");
        set.add("Himanshu");
        set.add("Harish");
        // adding duplicate elements
        set.add("Ayush");
        set.add("Ayush");
        set.add("Ayush");
        System.out.println(set+" "+ set.size());
    }
}
