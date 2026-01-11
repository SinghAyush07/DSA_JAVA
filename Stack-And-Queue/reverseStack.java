// Reverse Stack 

import java.util.Stack;
import java.util.Scanner;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st_orginal = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter Input: ");
        for(int i=0; i<n; i++) {
            st_orginal.push(sc.nextInt());
        }
        System.out.println(st_orginal);
        Stack<Integer> st_reverse = new Stack<>();
        while(!st_orginal.isEmpty()) {
            st_reverse.push(st_orginal.pop());
        }
        System.out.println(st_reverse);
        // creating
        
        sc.close();
    }
}
