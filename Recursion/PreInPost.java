// Pre-In-Post

import java.util.Scanner;

public class PreInPost {
    public static void pip(int n) {
        if(n == 0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pip(n);
        sc.close();
    }
}