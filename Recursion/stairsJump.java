// Find the number of ways to reach the top of the stairs with only 1 and 3 jumps allowed

import java.util.Scanner;

public class stairsJump {
    public static int stairs(int n) {
        if(n>1 && n<=3) return n-1;
        if(n<=1) return 1;
        return stairs(n-1) + stairs(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of stairs (n) : ");
        int n = sc.nextInt();
        int ans = stairs(n);
        System.out.println("Answer : " + ans);
        sc.close();
    }
}
