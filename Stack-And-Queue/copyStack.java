// copy one stack into another

import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st_orginal = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter Input: ");
        for(int i=0; i<n; i++) {
            st_orginal.push(sc.nextInt());
        }
        Stack<Integer> st_temp = new Stack<>();
        Stack<Integer> st_Copy = new Stack<>();
        while(!st_orginal.isEmpty()) {
            st_temp.add(st_orginal.pop());
        }
        while(!st_temp.isEmpty()) {
            st_Copy.add(st_temp.pop());
        }
        System.out.println(st_Copy);
        sc.close();
    }
}
