
import java.util.Scanner;

public class binarySearch {
    public static void print(int[] arr) {
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
        System.out.print("Enter the elements of array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);

        System.out.print("Enter the Target : ");
        int target = sc.nextInt();
        
        // Binary Search
        int lo = 0, hi = n-1;
        boolean flag = false;    // assuming target is not present in the array
        while(lo <= hi) {
            int mid = (lo+hi) / 2;
            if(arr[mid] < target) {
                lo = mid + 1;
            } else if(arr[mid] > target) {
                hi = mid-1;
            } else if(arr[mid] == target){
                flag = true;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Target found...");
        } else {
            System.out.println("Target not found....");
        }
        sc.close();
    }
}
