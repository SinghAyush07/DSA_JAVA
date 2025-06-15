// WAP to print starplus take input as odd number

package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){ 
                if (i == (n+1)/2) {
                    System.out.print("* ");
                } else if (j == (n+1)/2) {
                    System.out.print("*");
                    break;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}