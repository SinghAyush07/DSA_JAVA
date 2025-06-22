// WAP to print the matrix in spiral form

import java.util.Scanner;

public class SpiralMatrix {
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

        System.out.print("Enter the order of matrix (mxn) : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new  int[m][n];
        System.out.print("Enter the elements of matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array : ");
        printMatrix(mat);
        System.out.println("Spiral matrix : ");

        int minr = 0, maxr = m-1, minc = 0, maxc = n-1;

        //Blue : column : min -> max, row : const
        //Orange : column : const, row: min->max
        //Red : column : max -> min, row: const
        //Green : column : const, row : max -> min

        while(minr<=maxr && minc<=maxc) {
            // left to right
            for(int j=minc; j<=maxc; j++) {
                System.out.print(mat[minr][j] + " ");
            }
            minr++;
            // top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i = minr; i<=maxr; i++) {
                System.out.print(mat[i][maxc] + " ");
            }
            maxc--;
            // right to left
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc; j>=minc; j--){
                System.out.print(mat[maxr][j] + " ");
            }
            maxr--;
            // bottom to top
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr; i>=minr; i--) {
                System.out.print(mat[i][minc] + " ");
            }
            minc++;
        }
        sc.close();
    }
}
