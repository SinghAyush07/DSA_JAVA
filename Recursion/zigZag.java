// Print zig-zag.
// Input   Output
// 1        111
// 2        211121112
// 3        321112111232111211123
// 4        432111211123211121112343211121112321112111234

import java.util.Scanner;

public class zigZag {
    public static void zigzag(int n) {
        if(n==0) return;
        System.out.print(n + " ");  // pre
        zigzag(n-1);
        System.out.print(n + " ");  // in
        zigzag(n-1);
        System.out.print(n + " ");  // post
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        zigzag(n);
        System.out.println();
        sc.close();
    }
}
