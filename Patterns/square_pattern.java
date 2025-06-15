package Patterns;
// WAP to print a rectangle pattern using '*'.

import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int columns = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}