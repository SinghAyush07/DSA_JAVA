
import java.util.Scanner;

public class forEach2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][3];
        System.out.print("Enter the elements of arrays : ");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int[] ele: arr) {
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
