// Print sum from 1 to n (Return type).

import java.util.Scanner;

public class sumReturn {
    public static int add(int n) {
        if(n==0) return n;          // base case
        return n+add(n-1);          // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(add(n));
        sc.close();
    } 
}