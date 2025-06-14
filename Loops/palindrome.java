// WAP to check if a given string is palindrome or not using a loop

import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        sc.close();
        int x =0;
        for(int i=0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                System.out.println("Not a palindrome");
                x = 1;
                break;
            } 
        }
        if (x == 0) System.out.println("Is a palindrome");
    }
}