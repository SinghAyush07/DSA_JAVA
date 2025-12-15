// LeetCode 2442: Count number of distinct integers after Reverse Operations.

import java.util.HashSet;

public class countDistinctReverse {
    public static int reverse(int n) {
        int rev=0;
        while(n!=0) {
            int dig = n%10;
            rev = rev*10 + dig;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {1, 13, 24, 31, 46};
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr) {
            set.add(i);
            set.add(reverse(i));
        }
        System.out.println(set.size());
    }    
}
