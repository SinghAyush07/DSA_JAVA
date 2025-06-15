// Floyd's Triangle

package Patterns;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){      // rows
            for(int j=1; j<=i; j++){    // columns
                int start_Row = i*(i-1)/2 + 1;
                System.out.print(start_Row+j-1+ " ");
            }
            System.out.println();
        }

        // alternate method without using formula

        int a = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}