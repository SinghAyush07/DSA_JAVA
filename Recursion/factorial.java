// Make a function which calculates the factorial of n using recursion.

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if(n == 1 || n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}
