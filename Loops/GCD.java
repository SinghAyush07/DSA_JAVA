// WAP to find GCD of two numbers using a loop

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        int div = 1;

        for(int i=2; i<=a; i++){
            if (b % i == 0 && a%i ==0){
                div = i;
            }
        }
        System.out.println("Greatest Common Divisor : "+div);

        sc.close();
    }
}