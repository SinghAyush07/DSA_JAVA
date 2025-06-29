// Given a sorted integer array and an integer 'x', find the upper bound of x.
// UpperBound is the minimum index such that arr[idx] > x

import java.util.Scanner;

public class UpperBound {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        // using binary search for finding upper bound
        int lo = 0, hi = n-1;
        int hb = n;
        while(lb<=hb) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > target ) {
                hb = Math.min(mid, hb);
                hi = mid -1;
            } else lo = mid + 1;
        }
        System.out.println("Upper Bound : " + hb);
    }
}
