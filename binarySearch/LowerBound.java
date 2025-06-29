// Given a sorted integer array and an integer 'x', find the lower bound of x.
// (Smallest idx such that arr[idx] >= x);

import java.util.Scanner;

public class LowerBound {
     public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int lb = n;
        // using binary search algorithm
        int hi = n-1, lo = 0;
        while(lo<=hi) {
            int mid = lo + (hi-lo) / 2;
            if(arr[mid] < x) lo = mid + 1;
            else if(arr[mid] >= x) {
                lb = mid;
                hi = mid-1;
            }
        }
        System.out.print("Lower Bound : " + lb);
    }
}
