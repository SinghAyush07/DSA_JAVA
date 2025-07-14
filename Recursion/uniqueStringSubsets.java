// Print subsets of a string with unique characters.

import java.util.ArrayList;

public class uniqueStringSubsets {
    static ArrayList<String> arr = new ArrayList<>();
    public static void subSet(int i, String s, String ans) {
        if(i == s.length()) {
            arr.add(ans);
            return;
        }
        char c = s.charAt(i);
        subSet(i+1, s, ans);    // not take
        subSet(i+1, s, ans+c);  // take
    }
    public static void main(String[] args) {
        String s = "abc"; 
        subSet(0, s, "");
        System.out.println(arr);
    }
}
