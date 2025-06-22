// Score after flipping the matrix
// Unlimited moves including zero move
// Return the highest score after fliping the matrix

import java.util.Scanner;

public class ScoreAfterFlippingMat {
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

        System.out.print("Enter the dimensions of the Binary Matrix (m x n) : ");
        int m = sc.nextInt();
        int n= sc.nextInt();

        int[][] mat = new int[m][n];
        System.out.print("Enter the elements of binary matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Binary Matrix : ");
        printMatrix(mat);
        //Flipping the matrix and find the highest score

        //Step 1 : put 1 at 0th position of every row
        for(int i=0; i<m; i++){
            if(mat[i][0]==0) {  // flip that row
                for(int j=0; j<n; j++) {
                    if(mat[i][j] == 0) {
                        mat[i][j] = 1;
                    } else {
                        mat[i][j] =0;
                    }
                }
            }
        }

        //Step 2 : Flip those columns where number of 0's > number of 1's

        for(int j=1;j<n;j++){
            int count1=0;
            for(int i=0; i<m; i++) {
                if(mat[i][j] == 1) {
                    count1++;
                }
            }
            if (count1 < (m-count1)) {  // flip the column
                for(int i=0; i<m; i++ ) {
                    if(mat[i][j] == 0) {
                        mat[i][j] = 1;
                    } else {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        System.out.println("After Flipping the matrix : ");
        printMatrix(mat);

        // Finding the score of matrix

        int score = 0;
        int x = 1;
        for(int j=n-1; j>=0; j--) {
            for(int i=0; i<m; i++){
                score += (mat[i][j]*x);
            }
            x *= 2;
        }

        System.out.print("Score of Matrix after flipping : " + score);
        sc.close();
    }
}