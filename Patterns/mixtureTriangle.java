// WAP to print the following pattern
// 1
// A B 
// 1 2 3 
// A B C D

package Patterns;

import java.util.Scanner;

public class mixtureTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if (i%2 !=  0){
                    System.out.print(j + " ");
                } else {
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}