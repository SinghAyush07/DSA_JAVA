// Iterating over a hashSet

import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,3,5,1,2};
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set);
        // for(int ele : set) {
        //     System.out.print(ele + " ");
        // }
        // System.out.println();
        // set.clear();    // clears set
        
        // adding duplicate element will not work
        set.add(20);
        System.out.println(set);
    }    
}
