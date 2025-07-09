// Find number of ways to reach nth stair if 1 or 2 jump at a time is allowed

import java.util.Scanner;

public class StairPath {
    public static int stair(int n) {
        if(n<=2) return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total no. of stairs (n) : ");
        int n = sc.nextInt();
        int ans = stair(n);
        System.out.println("No. of ways : " + ans);
        sc.close();
    }
}
