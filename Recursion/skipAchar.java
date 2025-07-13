// Remove all occureness of 'a' from a string.

import java.util.Scanner;

public class skipAchar {
    public static void skip(int i, String s, String ans) {
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i) != 'a' && s.charAt(i) != 'A') ans += s.charAt(i);
        skip(i+1,s,ans);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a String : ");
        // String s = sc.nextLine();
        // print(0,s);
        // sc.close();

        String s = "Ayush Aryan";
        skip(0,s,"");
    }
}
