// checking if the array is sorted before every pass

import java.util.Scanner;

public class bubbleSortOptimized {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
       
        // Bubble Sort Optimised
        for(int x=0; x<n-1; x++) {
            boolean flag = true;
            for(int i=0; i<n-1-x; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);
        sc.close();
    }
}
