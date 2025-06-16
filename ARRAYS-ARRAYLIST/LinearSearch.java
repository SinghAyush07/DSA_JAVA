// Find the element 'x' in the array. Take array and x as input

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number 'x' : ");
        int x = sc.nextInt();
        sc.close();

        // Performing Linear Search
        boolean flag = false; // false means not found

        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                flag = true; // true means found
                break;
            }
        }

        if(flag){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found!!");
        }
    }
}
