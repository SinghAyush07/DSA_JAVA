// Sort a given Array in increasing order using selectioin sort,
// but in each pass, put the kth maximum element at
// the right position.

import java.util.Scanner;

public class selectionSortkth {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i,int j) {
        // swappin arr[i] with arr[i+1]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Elements in the Arrays : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);  // printing the original array

        // Selection Sort Increasing Order
        // Instead of keeping min element at left
        // we keep max element at right

        for(int i=n-1; i>=0; i--) {
            int max = Integer.MIN_VALUE;
            int maxidx = -1;
            for(int j=0; j<=i; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxidx] = temp;

        }
        // Printing sorted array
        print(arr);
        sc.close();
    }
}
