// Find First and Last Position of Element in Sorted Array



public class firstAndlastOcc {
    public static void main(String[] args) {
        int[] ans = {-1, -1};
        int n = nums.length;
        int lb = n;
        int lo = 0, hi = n-1;
        boolean flag = false;  // Assuming the `target` is not present in array
        // now chechk if the target is present in the array
        // Binary Search
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target) {
                flag = true;
                break;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            }
        }
        if(flag == false) System.out.println(ans);
        lo =0; hi = n-1;
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(nums[mid] >= target) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else lo = mid + 1;
        }

        lo=0; hi = n-1;
        int ub = n;
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(nums[mid] > target) {
                ub = Math.min(ub, mid);
                hi = mid - 1;
            } else lo = mid + 1;
        }

        ans[0] = lb;
        ans[1] = ub-1;
        System.out.println(ans);
    }
}
