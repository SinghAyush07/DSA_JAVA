// Given mxn grid you have to reach from top left 
// corner to bottom right corner. You can go either
// down or right at a time. Find the no. of paths.

import java.util.Scanner;

public class mazePath {
    // Going from (1,1) to (m,n)
    public static int maze(int row, int col, int m, int n) {
        if(col == n || row == m) return 1;
        // other base cases
        // if(row == m && col == n) return 1;
        // if(row>m || col>n) return 0;
        int rightWays = maze(row, col+1, m, n);
        int downWays = maze(row+1, col, m, n);
        return rightWays + downWays;
    }
    // Going from (m,n) to (1,1)
    public static int maze2(int m, int n) {
        if(m==1 || n==1) return 1;
        int rightWays = maze2(m,n-1);
        int downWays = maze2(m-1,n);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grid mxn : ");
        int m = sc.nextInt();
        int n = sc.nextInt(); 
        //int ans = maze(1,1,m,n);
        int ans = maze2(m,n);
        System.out.println(ans);
        sc.close();
    }
}
