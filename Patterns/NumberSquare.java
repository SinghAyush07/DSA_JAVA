// WAP to print square made up of 

package Patterns;
import java.util.Scanner;

class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}