
import java.util.Scanner;

public class MatrixMultiplication {
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

        System.out.print("Enter the dimension of first matrix (mxn) : ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] mat1 = new int[m1][n1];
        System.out.print("Enter the dimension of second matrix (nxo) : ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] mat2 = new int[m2][n2];
        System.out.print("Enter the elements of first matrix : ");
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the elements of second matrix : ");
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First matrix : ");
        printMatrix(mat1);
        System.out.println("Second matrix : ");
        printMatrix(mat2);

        if (n1 != m2) {
            System.out.println("Matrix multiplication not possible with the matrices of entered Dimensions.");
            System.exit(0);
        }

        // Matrix multiplication
        int[][] result = new int[m1][n2];

        for(int i=0; i<m1; i++) {
            for(int j=0; j<n2; j++) {
                for(int k=0; k<n1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Resultant Matix : ");
        printMatrix(result);

        sc.close();
    }
}