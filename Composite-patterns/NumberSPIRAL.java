//Print a spiral pattern of Number using java

import java.util.Scanner;

public class NumberSPIRAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=2*n-1; i++) {
            for(int j=1; j<=2*n-1; j++) {
                int a = i, b = j;
                if(i>n) {
                    a = 2*n-i;
                }
                if(j>n) {
                    b = 2*n-j;
                }
                int k = n + 1 - Math.min(a, b);
                System.out.print(k+ " ");
            }
            System.out.println();
        }


    }
}