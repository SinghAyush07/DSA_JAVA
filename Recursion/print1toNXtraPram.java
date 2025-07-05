// Print 1 to N using recursion.

import java.util.Scanner;

public class print1toNdiff {
    public static void print(int x, int n) {
        if(x>n) return;             // base case
        System.out.print(x+ " ");   // work
        print(x+1,n);                 // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        print(1);
        System.out.println();
        sc.close();
    }
}
