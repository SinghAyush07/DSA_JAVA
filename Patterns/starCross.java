// WAP to print star cross take an odd number as input

package Patterns;

import java.util.Scanner;

public class starCross{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close(); 

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i == (n-1-j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}