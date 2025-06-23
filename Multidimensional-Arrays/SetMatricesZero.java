

import java.util.Scanner;

public class SetMatricesZero {
    public static void printMatrix(int[][] mat){
        for(int[] ele : mat) {
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void setmatrixzero(int[][] mat, int a, int b) {
        for(int i=0; i<mat.length; i++) {
            mat[i][b] =0;
        }
        for(int j=0; j<mat[0].length; j++) {
            mat[a][j] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimensions of matrix (m x n) : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.print("Enter the elements of the matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered Matrix : ");
        printMatrix(mat);

        // Method 1 : Bad method : Using extra matrix

       // int[][] helper = mat;  <- this will create shallow copy

    //    int[][]helper = new int[m][n];
    //    for(int i=0; i<m; i++) {
    //     for(int j=0; j<n; j++) {
    //         helper[i][j] = mat[i][j];
    //     }
    //    }
        
       // we use helper to traves and find the position of zeroes and then we make the column and row zeroes of the original mat

    //    for(int i=0; i<m; i++) {
    //     for(int j=0; j<n; j++) {
    //         if(helper[i][j]==0) {
    //             setmatrixzero(mat,i,j);
    //         }
    //     }
    //    }

    //    System.out.println("Ouput matrix : ");
    //    printMatrix(mat);

       // Method 2: Somewhat Optimized but still not Best
       // Just Identify the row and column
       // m + n space

    //    boolean[] row = new boolean[m];
    //    boolean[] column = new boolean[n];
    //     // marking particular row and column
    //    for(int i=0; i<m; i++) {
    //     for(int j=0; j<n; j++) {
    //         if(mat[i][j] == 0) {
    //             row[i] = true;
    //             column[j] = true;
    //         }
    //     }
    //    }
    //    // Set the true rows to 0
    //    for(int i=0; i<m; i++) {
    //     if (row[i] == true) {
    //         for(int j=0; j<n;j++) {
    //             mat[i][j] = 0; 
    //         }
    //     }
    //    }
    //    // Set the true col to 0
    //    for(int j=0; j<n; j++) {
    //     if(column[j] == true) {
    //         for(int i=0; i<m; i++) {
    //             mat[i][j] = 0;
    //         }
    //     }
    //    }
    //    System.out.println("Resultant Matrix : ");
    //    printMatrix(mat);

    // Method 3 : Best Method
    // Using Constant extra space solution
    // use 0th row and col as the extra space to mark zeroes

    // First check if there is any 0's present in the 0th row and column initially before starting to chech other part of the matrix
    boolean zeroRow = false;
    boolean zeroCol = false;

    for(int j=0; j<n; j++) { // checking 0th row
        if(mat[0][j] == 0) {
            zeroRow = true;
            break;
        }
    }

    for(int i=0; i<m; i++) { // checking 0th column
        if(mat[i][0] == 0) {
            zeroCol = true;
            break;
        }
    }

    for(int i=1; i<m; i++) {
        for(int j=1; j<n; j++) {
            if(mat[i][j] == 0) {
                mat[0][j] = 0;
                mat[i][0] = 0;
            }
        }
    }
    // now search the 0's in 0th row and column and making the corresponding columns and rows zero respectively


    // for rows
    for(int i=1; i<m; i++) {
        if(mat[i][0] == 0) {
            for(int j=1; j<n; j++){  // making the whole row zero
                mat[i][j] = 0;
            }
        }
    }

    // for column
    for(int j=1; j<n; j++) {
        if(mat[0][j] == 0) {
            for(int i=1; i<m; i++) { // making the whole column zero
                mat[i][j] = 0;
            }
        }
    }

    if(zeroRow == true) {
        for(int j=0; j<n ; j++) {
            mat[0][j] = 0;
        }
    }

    if(zeroCol == true) {
        for(int i=0; i<m; i++) {
            mat[i][0] = 0;
        }
    }


    System.out.println("Resultant Matrix : ");
    printMatrix(mat);

    sc.close();
    }
}
