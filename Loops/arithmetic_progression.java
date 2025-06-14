// Display AP upto n terms, ap - 1,3,5,7 ..... upto "n" terms.

import java.util.Scanner;

public class arithmetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int N = sc.nextInt();
        int a=1;
        for(int i=0; i<N; i++){ 
            System.out.println(a);
            a+=2;
        }
        sc.close();
    }
    // using mathematical formula an = a + (n-1)*d
}
