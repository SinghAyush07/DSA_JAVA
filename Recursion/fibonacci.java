// Write a function to calculate the nth fibonacci number using recursion.

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n) {
        if(n<=1) return 1;
        return fibo(n-1) + fibo(n-2);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fibo(n-1));
        sc.close();
    }
}
