// WAP to print the matrix in wave form

import java.util.Scanner;

public class matrixWaveform {

    public static void printMatrix(int[][] mat){

        for(int[] ele : mat) {
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix (mxn): ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.print("Enter the elements of matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered matrix : ");
        printMatrix(mat);

        for(int i=0; i<m; i++) {
            if(i%2 == 0) {
                for(int j=0; j<n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for(int j=n-1;j>=0;j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
