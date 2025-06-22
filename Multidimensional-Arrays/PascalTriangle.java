// Give an integer "numRows", generate Pascal's triangle.

// Using 2-D array list we can generate the traingle 

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        List<List<Integer>> ans = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0; j<=i; j++){
                //a.add(1);
                if(j==0 || j==i) {
                    a.add(1);
                } else {
                    a.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(a);
        }

        // for(int i=2; i<ans.size(); i++) {
        //     for(int j=1; j<i;j++) {
        //     ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
        //     }
        // }

        System.out.print(ans);
        sc.close();
    }
}