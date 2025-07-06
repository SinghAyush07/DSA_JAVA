// Power function (logarithmic)

import java.util.Scanner;

public class powLogTC {
    public static int powLog(int a, int b) {
        if(b==0) return 1;
        int ans = powLog(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : " );
        int a = sc.nextInt();
        System.out.print("Enter the power : ");
        int b = sc.nextInt();
        System.out.print(a+" raised to the power " + b + " is " + powLog(a, b));
    }
}
