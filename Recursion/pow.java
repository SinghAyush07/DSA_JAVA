// Make a function which calculates 'a' raised to the power 'b' using recursion. Take 'a' and 'b' input from user.

import java.util.Scanner;

public class pow {
    public static int power(int a, int b) {
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter power : ");
        int b = sc.nextInt();
        if(b>0){
            int ans = power(a,b);
        System.out.println(a+" raised to the power "+b+" is "+ans);
        } else {
            b = -b;
            System.out.println(b);
            float ans = (float)1/power(a,b);
            b = -b;
        System.out.println(a+" raised to the power "+b+" is "+ans);
        }
        sc.close();
    }
}
