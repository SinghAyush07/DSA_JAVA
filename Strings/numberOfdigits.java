// Return the total number of digits in a number without using any loop (hint : use inbuilt Integer.toString() function).

import java.util.Scanner;

public class numberOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int length = Integer.toString(num).length();
        System.out.print("Number of digits : "+ length);

        sc.close();
    }
}
