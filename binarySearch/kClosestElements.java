// Find K closest Elements.

import java.util.List;
import java.util.ArrayList;

public class kClosestElements {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = {1,3,5,8,9,10};
        int k=3, x = 6;
        int i=0, j=0;
        int lb = arr.length;
        int lo=0, hi = arr.length-1;
        while(lo<=hi) {
             int mid = lo + (hi-lo)/2;
            if(x<=arr[mid]) {
                lb = Math.min(mid,lb);
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        System.out.println(lb);
    }
}
