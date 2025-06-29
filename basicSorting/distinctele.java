// Given an array with N distinct elements convert given array to a form where all elements are in range from 0 to N-1. The order of elements is placed in place of smallest element, 1 is placed for second samallest,....... N-1 is placed for largest element. (Consider all elements are greater than 0)

import java.util.Scanner;

public class distinctele {
    public static void print(int[] arr) {
        System.out.print("Array : ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {40,12,78,34,100,57,23};
        //         //.   3, 0, 5, 2,  6, 4, 1.    <- Final Answer
        // int n = arr.length;
        print(arr);
        int x=0;
        for(int i=0; i<n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=0; j<n; j++){
                if(arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        // change the sign of all the elements
        for(int i=0; i<n; i++) {
            arr[i] *= -1;
        }
        print(arr);
        sc.close();
    }
}