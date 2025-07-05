// Print 1 to N using recursion.

import java.util.Scanner;

public class print1toNdiff {
    static int n; // global variable
    public static void print(int x) {
        if(x>n) return;             // base case
        System.out.print(x+ " ");   // work
        print(x+1);                 // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        n = sc.nextInt();
        print(1);
        System.out.println();
        sc.close();
    }
}
