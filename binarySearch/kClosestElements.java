// Find K closest Elements.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class kClosestElements {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = {1,3,5,8,9,10};
        int k=3, x = 7;
        int n =arr.length;
        // first handle the edge cases
        // if the x is smaller than arr[0]
        if(x < arr[0]) {
            for(int i=0; i<k; i++){
                ans.add(arr[i]);
            }
        }
        // if the x is greater than arr[n-1]
        if(x>arr[n-1]) {
            for(int i=n-k; i<n; i++){
               ans.add(arr[i]);
            }
        }

        // Find the lower bound of x
        int lo=0, hi= n-1;
        int lb = n;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(x<=arr[mid]) {
                lb = mid;
                hi = mid-1;
            } else lo = mid+1;
        }

        // Using two pointer i and j to navigate in array

        int i=lb-1, j=lb;

        while(k>0 && i>=0 && j<n) {
            int di = Math.abs(arr[i] - x);
            int dj = Math.abs(arr[j] - x);
            if(di<=dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        while(k>0 && i<0) {
            ans.add(arr[j]);
            j++;k--;
        }
        while(k>0 && j>n) {
            ans.add(arr[i]);
            i--;k--;
        }
        Collections.sort(ans);
        System.out.print(ans);
    }
}
