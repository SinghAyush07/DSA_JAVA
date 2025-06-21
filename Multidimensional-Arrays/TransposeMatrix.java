// WAP to print the transpose of the matrix entered by the user and store it in a new matrix.

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of matrix (m x n) : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.print("Enter the elements of Matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix : ");
        // initializing a new array
        int[][] transposedArray = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                transposedArray[i][j] = arr[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}