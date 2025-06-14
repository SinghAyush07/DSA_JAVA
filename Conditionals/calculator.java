// Write a program to create a calculator that 
// performs basic arithematic operations (add, 
// subtract, multiply and divide) using switch case 
// and functions. The calculator should input two 
// numbers and an operator from user.

import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b :");
        int b = sc.nextInt();

        System.out.println("Enter operation needed to be performed :\n 1. multiplication \n 2. dividion \n 3. addition \n 4. subtraction");
        int n = sc.nextInt();
        System.out.print("Result : ");
        switch(n) {
            case 1 : System.out.println(a*b);
                     break;
            case 2 : System.out.println(a/b);
                     break;
            case 3 : System.out.println(a+b);
                     break;
            case 4 : System.out.println(a-b);
                     break;
            default : System.out.println("Invalid operation.....");
                     break;
        }
   } 
}
