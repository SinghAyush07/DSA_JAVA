// Take 3 numbers input and tell if they can be sides of a triangle

import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        if ((a+b) > c && (b+c) > a && (c+a) > b){
            System.out.println("a, b and c are sides of triangle.");
        } else {
            System.out.println("a, b and c cannot be the sides of a triangle.");
        }
    }    
}
