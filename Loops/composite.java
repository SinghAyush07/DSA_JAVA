// WAP to check if a number is composite or not.

import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=2; i<n; i++){
            if(n%i == 0) {
                System.out.println("Composite number");
                break;
            } else {
                System.out.println("Prime Number");
            }
        }
        sc.close();
    }
}