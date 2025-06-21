

import java.util.Scanner;

public class SumTwoMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix (m x n) : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        

        System.out.print("Enter the Elements of Matrix 1 : ");
        int[][] arr1 = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the Elements of Matrix 2 : ");
        int[][] arr2 = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.print("Resultant matrix : \n");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}