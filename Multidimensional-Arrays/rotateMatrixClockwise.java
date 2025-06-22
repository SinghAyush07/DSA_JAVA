// leet code problem 48
import java.util.Scanner;

public class rotateMatrixClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix : ");
        int m = sc.nextInt();

        int[][] mat = new int[m][m];
        System.out.print("Enter the elements of matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // to rotate the array first take transpose

        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j]  = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // rotate => tranpose then reverse the matrix column wise

        for(int i=0; i<m; i++) {
            int a=0, b=m-1;
            while(a<b) {
                int temp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = temp;
                a++;
                b--;
            }
        }

        System.out.println("Rotated Matrix : ");
        for(int[] ele : mat) {
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}