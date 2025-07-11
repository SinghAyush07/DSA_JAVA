// Print all the elements of the array using recurssion

import java.util.Scanner;

public class printArray {
    public static void print(int i, int[] arr) {
        if(i==arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements of Array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(0,arr);
        System.out.println();
        sc.close();
    }
}
