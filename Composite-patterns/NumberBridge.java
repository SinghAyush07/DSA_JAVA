// WAP to print number bridge pattern

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=(2*n-1); i++){
            System.out.print(i + " ");
        }
        n--;
        System.out.println();
        int nsp = 1;
        for(int i=1; i<=n; i++) {
            int a = 1;
            for(int j=1; j<=n+1-i ; j++) {
                System.out.print(a++ + " ");
            }
            for(int j=1; j<=nsp; j++) {
                System.out.print("  ");
                a++;
            }
            nsp += 2;
            for(int j=5; j<=n+5-i; j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}