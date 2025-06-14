// WAP to print sum of digits of a given number.

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}