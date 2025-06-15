// WAP to print a alphabet square

package Patterns;

import java.util.Scanner;

class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=65; j < 65+n; j++){
                System.out.print((char) j +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}