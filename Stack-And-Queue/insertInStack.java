// Push element at bottom or any index in a Stack

import java.util.Scanner;
import java.util.Stack;

public class insertInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st_Orignal = new Stack<>();
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        for(int i=0; i<n; i++) {
            st_Orignal.push(sc.nextInt());
        }
        Stack<Integer> st_temp = new Stack<>();
        // inserting number at bottom of stack
        while(!st_Orignal.isEmpty()) {
            st_temp.push(st_Orignal.pop());
        }
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        st_temp.push(num);
        while(!st_temp.isEmpty()) { 
            st_Orignal.push(st_temp.pop());
        }
        //inserting at ith index
        System.out.print("Enter the number and index : ");
        int num2 = sc.nextInt();
        int idx = sc.nextInt();
        // displaying stack
        while(!st_Orignal.isEmpty()) {
            System.out.println(st_Orignal.pop());
        }
        sc.close();
    }
}
