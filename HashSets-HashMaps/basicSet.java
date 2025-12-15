// HashSet

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert: TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size is " + set.size());
        set.add(-8);
        set.add(200);
        // System.out.println(set);
        // Search - true/false : TC = O(1);
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set.contains(50));
        System.out.println(set);
        // Remove: TC = O(1)
        set.remove(50);
        System.out.println(set);
        set.remove(300); // no error
        System.out.println(set+" "+set.size());
        // toArray
        Object[] arr = set.toArray();
        for(Object i:arr) {
            System.out.print(i+" ");
        }
    }
}
