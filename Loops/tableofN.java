// Print the table of 19

import java.util.Scanner;

public class tableofN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i <= (n*10); i+=n){
            // if (i%n == 0) {
            //     System.out.println(i);
            // }
            System.out.println(i);
        }
        sc.close();
    }
}