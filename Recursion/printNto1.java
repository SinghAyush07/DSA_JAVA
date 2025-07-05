// Print n to 1.

import java.util.Scanner;

public class printNto1 {
    public static void print(int n) {
        if (n==0) {             // base case
            return;
        }
        System.out.print(n + " ");      // work
        print(n-1);                     // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
