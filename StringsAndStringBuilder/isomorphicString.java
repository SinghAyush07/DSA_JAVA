// Given two strings s and t determine if they are isomorphic.

import java.util.Scanner;

public class isomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.next();
        System.out.print("Enter the stri ng : ");
        String t = sc.next();

        // the characters should have one one mapping
        char[] a = new char[128];   // total characters

        boolean flag = true;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch - 1;
            if(a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx-1]!=dh) 
                     flag=false;
            }
        }

        for(int i=0; i<128; i++) {
            a[i] = '\0';
        }

        for(int i=0; i<s.length(); i++) {
            char ch = t.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch - 1;
            if(a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx-1]!=dh) 
                     flag=false;
            } 
        }
        System.out.println(flag);
        sc.close();
    }
}
