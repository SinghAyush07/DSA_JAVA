
import java.util.Scanner;

public class transformIntoTranspose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of matrix (m x m) : ");
        int m = sc.nextInt();

        int[][] arr = new int[m][m];

        System.out.print("Enter the elements of Matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix : ");

        for(int[] ele : arr) {
            for(int x : ele) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }

        // Transposing a square matrix is same as taking reflection of its element across leading diagonal

        // And the element of the leading diagonals remains same

        for(int i=0; i<m; i++) {
            for(int j=0; j<i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }


        System.out.println("Transposed Matrix : ");

        for(int[] ele : arr) {
            for(int x : ele) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
