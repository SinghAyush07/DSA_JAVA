
import java.util.Scanner;

public class storeRollanMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];
        System.out.print("Enter roll no. and marks of students : ");

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}