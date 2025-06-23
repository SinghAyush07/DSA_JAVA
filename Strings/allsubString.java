// Input a string and print all the substrings of that string

import java.util.Scanner;

public class allsubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
