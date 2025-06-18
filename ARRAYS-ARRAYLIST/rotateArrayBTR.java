//rotate array reverse with better time complexity

import java.util.Scanner;

public class rotateArrayBTR {
    public static void reverse(int[] arr, int i, int j) {
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        System.out.print("Enter elements of Array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();
        k %= n;   // makes sure the k is always less than array size
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-k-1);
        reverse(arr, 0, n-1);
        sc.close();
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}