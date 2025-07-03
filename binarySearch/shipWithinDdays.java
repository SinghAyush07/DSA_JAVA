// Capacity to ship packages within D days

public class shipWithinDdays {
    public static boolean isPossible(int c, int[] arr, int d) {
        int n = arr.length;
        int load = 0, days = 1;
        for(int i=0; i<n; i++) {
            if(load+arr[i] <= c) load += arr[i];
            else {
                load = arr[i];
                days++;
            }
        }
        if(days > d) return false;
        else return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int n = arr.length;
        int sum = 0, mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            mx = Math.max(mx, arr[i]);
        }

        // lo -> minimum capacity of ship to carry atmost one cargo in a day
        // hi -> maximum capacity of ship to carry all the cargo in one day
        int minC = 0;           // min capacity of the ship that is require to carry cargos in given days
        int lo = mx, hi = sum;
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(isPossible(mid, arr, days)) {
                minC = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(minC);
    }
}
