//Print Give pattern
// 1
// 01
// 101
// 0101

package Patterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        // Basic Method
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                // if (i%2 == 1){
                //     if (j%2 == 1){
                //         System.out.print(1);
                //     } else {
                //         System.out.print(0);
                //     }
                // } else {
                //     if (j%2 == 0) {
                //         System.out.print(1);
                //     } else {
                //         System.out.print(0);
                //     }
                // }
                
                // using some brain

                if((i + j)%2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}