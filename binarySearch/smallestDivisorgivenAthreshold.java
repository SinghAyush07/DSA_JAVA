
// Find the smallest Divisor given a Threshold

public class smallestDivisorgivenAthreshold {
    public static void main(String[] args) {
        int[] arr = {5,1,9,2};
        int t = 6; // threshold
        // Brute force
        int n = arr.length;
        int d; // divisor
        int ans=0;
        int mx = Integer.MIN_VALUE;

        // Method 1 : Brute Force the logic
        for(int i=0; i<n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        for(d=1; d<=mx; d++) {  
            int sum = 0;
            for(int i=0; i<n; i++) {
                if(arr[i]%d == 0) sum += arr[i]/d;
                else sum += arr[i]/d + 1;
            }
            if(sum <= t) {
                ans = d;
                break;
            }
        }
        System.out.println(ans);
    }
}
