
// Find the smallest Divisor given a Threshold

public class smallestDivisorgivenAthreshold {
    public static boolean isLess(int mid, int[] arr, int t) {
        int sum=0;
        boolean ans = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%mid == 0)  sum += arr[i]%mid;
            else sum += arr[i]%mid + 1;
        }
        if(sum<=t) ans = true;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int t = 6; // threshold
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        // Brute force
        // Method 1 : Brute Force the logic
        // for(d=1; d<=mx; d++) {  
        //     int sum = 0;
        //     for(int i=0; i<n; i++) {
        //         if(arr[i]%d == 0) sum += arr[i]/d;
        //         else sum += arr[i]/d + 1;       // add 1 if the element is not completely divisible by d.
        //     }
        //     if(sum <= t) {
        //         ans = d;
        //         break;
        //     }

        // using binary search method to find the d
        int d=0;
        int lo = 1, hi = mx;
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(isLess(mid,arr,t)) {
                hi = mid - 1;
                d = mid;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(d);
    }
}
