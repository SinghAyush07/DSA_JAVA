
import java.util.Scanner;

public class StarPyramidXtraVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        // Using extra variables nsp and nst
        int nsp = n-1;
        int nst = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<nsp; j++) {
                System.out.print("  ");
            }
            for(int j=0; j<nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}