// Given n string consisting of digits from 0 to 9. Return the string which has maximum value.

import java.util.Scanner;

public class maxvalueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of numbers : ");
        int n = sc.nextInt();
        System.out.print("Enter the numbers : ");
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = sc.next();
        }

        // Bad method will not work for larger number like 876894738943573482
        // int mx = Integer.MIN_VALUE;
        // for(int i=0; i<str.length; i++) {
        //     int num = Integer.parseInt(str[i]);
        //     mx = Math.max(mx, num);
        // }
        // System.out.print("Maximum Number : " + mx);

        // Better Method

        String maxS = str[0];
        for(int i=0; i<n; i++) {
            maxS = max(maxS, str[i]);
        }
        System.out.println(maxS);
        sc.close();
    }

    public static String max(String a, String b) {
       // removing front 0's
       String s = purify(a) , t = purify(b);
       if(s.length()>t.length()) return a;
       if(s.length()<t.length()) return b;
        
       // If length is equal we compare MSB from right
        if (s.length() == t.length()) {
            for(int i=0; i<s.length(); i++) {
             if(s.charAt(i)!=t.charAt(i)){
                 if(s.charAt(i) > t.charAt(i)) return a;
                 else return b;
             }
            }
        }
       if(a.length() >= b.length()) return a;
       else return b;
    }

    public static String purify(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) !='0' ) {
                str += s.charAt(i);
            }
        }
        return str;
    }
}
