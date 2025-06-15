//Print an inverted right angle triangle

package Patterns;

import java.util.Scanner;

public class starTriangleReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=n-1-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}