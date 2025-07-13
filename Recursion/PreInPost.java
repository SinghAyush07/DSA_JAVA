// Pre-In-Post

import java.util.Scanner;

public class PreInPost {
    public static void pip(int n) {
        if(n == 0) return;          // base case
        System.out.println("pre " + n);      // work
        pip(n-1);                   // call
        System.out.println("in " + n);      // work
        pip(n-1);                   // call
        System.out.println("post " + n);      // work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pip(n);
        sc.close();
    }
}