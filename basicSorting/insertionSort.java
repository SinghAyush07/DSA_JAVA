
import java.util.Scanner;

public class insertionSort {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of ele : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);

        // inserstion sort
        for(int i=1; i<n; i++) {
            for(int j=i; j>=1; j--) {           
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else break;
            }
        }

        print(arr);
        sc.close();
    }
}
