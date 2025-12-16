// LeetCode: Find Maximum Numbers of String Pairs

import java.util.HashSet;

public class maxNumberStringPairs {
    public static String reverseString(String s) {
        // Using String
        // String rev="";
        // for(int i=s.length()-1; i>=0; i--) {
        //     rev += s.charAt(i);
        // }
        // return rev;

        // Using StringBuilder 
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "zz", "ut", "tu"};
        int count=0;
        HashSet<String> set = new HashSet<>();
        for(String ele: words) {
            String rev = reverseString(ele);
            if(set.contains(rev)) {
                count++;
                set.remove(rev);
            } else {
                set.add(ele);
            }
        }
        System.out.println(count);
    }
}
