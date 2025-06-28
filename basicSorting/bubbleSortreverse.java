// Sort a given Array in decreasing order using bubble sort

import java.util.Scanner;

public class bubbleSortreverse {
     public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i) {
        // swappin arr[i] with arr[i+1]
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
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

        //sorting in decreasing order using bubble sort
        for(int x=0; x<n-1; x++) {
            boolean flag = true;
            for(int i=0; i<n-1-x; i++) {
                if(arr[i] < arr[i+1]) {
                    swap(arr, i);
                    flag = false;
                }
            }
            if(flag == true) {
                break;
            }
        }
        System.out.print("Array in decreasing order : ");
        print(arr);
        sc.close();
    }
}
