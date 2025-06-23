// Take integer input and convert it into a String

import java.util.Scanner;

public class intTostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer : ");
        int n = sc.nextInt();
        
        String s = "";
        s += n;
        System.out.print(s);
        sc.close();
    }    
}
