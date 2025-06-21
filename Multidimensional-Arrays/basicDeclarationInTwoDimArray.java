

import java.util.Scanner;

public class basicDeclarationInTwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];

        int m = arr.length;         // no of rows / lines
        int n = arr[0].length;    // no of columns
        System.out.print("Enter the elements of array : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}