// Find maximum number stored in array and print it
// Also find Second largest number

import java.util.Scanner;

public class maxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of the Array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding maximum element
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            // max = Math.max(max,a[i]);
        }
        System.out.println(max);
        sc.close();
        //Finding second largest element
        int smx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max!=arr[i]) {
                smx = Math.max(smx, arr[i]);
            }
        }
        System.out.println("Second Largest Element : " + smx);
    }
}