// Rotate the given array 'a' by k steps, where k is non-negative.

// k can be greater than n as well where n is the size of array 'a'.

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        k %= n;
        //reverse using an extra array
        int[] res = new int[n];
        int i=0, rot=k;
        while(k!=0) {
            res[k-1] = arr[n-1-i];
            i++;
            k--;
        }
        while(i<n) {
            res[i] = arr[i-rot];
            i++;
        }
        for(int ele : res) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}