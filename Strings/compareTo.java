
// compare two strings lexographically (i.e dictionary wise)

import java.util.Scanner;

public class compareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the Second String : ");
        String str2 = sc.nextLine();

        // comparing the two string

        System.out.print(str1.compareTo(str2));

        sc.close();
    }
}

