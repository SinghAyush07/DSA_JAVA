// Generate all binary strings of length n without consecutive 1's.

import java.util.Scanner;

public class binaryString {
    public static void printBinString(int n, String ans) {
        if(ans.length()==n) {
            System.out.print(ans + " ");
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1) == '0') {
            printBinString(n, ans+1);
            printBinString(n, ans+0);
        }
        else {
            printBinString(n, ans+0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        printBinString(n, "");
        System.out.println();
        sc.close();
    }
}
