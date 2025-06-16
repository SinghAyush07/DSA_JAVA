import java.util.Scanner;

public class initializeArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = sc.nextInt();

        // Declaration of Array
        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //printing the array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
}
