// WAP to find whether a number is prime number or not.

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int x=0;
        for(int i=2; i<n ; i++){
            if(n%i == 0){
                System.out.println("Composite Number");
                x = 1; // 1 means composite
                break;
            }
        }
        if (n==1) {
            System.out.println("Neither prime nor composite number.");
        }
        if(x==0) {
            System.out.println("Prime number");
        }
        sc.close();
    }
}