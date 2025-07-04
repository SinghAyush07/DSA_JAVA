// Print 1 to N using recurssion in java.

import java.util.Scanner;

public class print1toN {
    public static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
