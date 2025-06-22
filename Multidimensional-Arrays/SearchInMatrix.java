// Write an efficient algorithm that searches for a value target in an m x n integer matrix which has the following properties :

// Integers in each row are sorted in ascending from left to right.

// Integers in each column are sorted in ascending from top to bottom.

import java.util.Scanner;

public class SearchInMatrix {
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

        System.out.print("Enter the dimension of the Materix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.print("Enter the elements of binary matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        System.out.println("Entered Binary Matrix : ");
        printMatrix(mat);

        // moving left and down only 

        int i=0, j=n-1;
        boolean found = false;
        while(i<m && j>=0) {
            if(mat[i][j] == target) {
                System.out.println("Found");
                found = true;
                break;
            } else if ( mat[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        if(found == false)
        System.out.print("NOT FOUND");
    }
}
