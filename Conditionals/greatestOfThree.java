// Take 3 positive integers input and print the greatest of them
import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest input.");
            } else {
                System.out.println(c + " is greatest input.");
            }
        } else {
            if (b > c){
                System.out.println(b + " is greatest input.");
            } else {
                System.out.println(c + " is greatest input.");
            }
            sc.close();
        }
        // alter:- using logical operator &&
        //  if (a>b && a>c) System.out.println(a+" is greatest.")
        //  if (b>a && b>c) System.out.println(b+" is greatest.")
        //  if (c>a && c>b) System.out.println(c+" is greatest.")
    }
}
