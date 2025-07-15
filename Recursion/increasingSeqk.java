// Print all increasing sequences of length k from first n naturnal numbers

import java.util.Scanner;

public class increasingSeqk {
    public static void print(int i, int k, int n, String ans) {
        if(i == n+1) {
            if(ans.length() == k) {
                System.out.print(ans + " ");
            }
            return;
        }
        print(i+1, k, n, ans);
        ans += i;
        print(i+1, k, n, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number K: ");
        int k = sc.nextInt();
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        print(1, k, n, "");
        sc.close();
    }
}
