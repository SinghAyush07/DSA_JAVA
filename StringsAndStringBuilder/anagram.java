// Given two Strings s and t, return true if t is an anagram of s, and false otherwise

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string s : ");
        String s = sc.nextLine();
        System.out.print("Enter the string t : ");
        String t = sc.nextLine();
        if(s.length()!=t.length()) System.out.println(false);
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);
        boolean ans = true;
        for(int i=0; i<sarr.length; i++) {
            if(sarr[i] != tarr[i]) {
                ans = false;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
