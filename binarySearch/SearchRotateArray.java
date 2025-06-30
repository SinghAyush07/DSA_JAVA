
public class SearchRotateArray {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 0, 1, 2, 3, 4 , 5, 6};
        int target = 4;
        int n = arr.length;
        int lo = 0, hi = n-1;
        int idx = -1;
        while(lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target) {
                idx = mid; break;
            } else if(arr[mid] <= arr[hi]) { 
                // this means the mid is at right side
                // of the pivot
                if(arr[mid] <= target && target <= arr[hi]) lo = mid+1;
                else hi = mid-1;
            } else if(arr[mid] > arr[hi]) {
                // this means the mid is at left side
                // of the pivot
                if(arr[lo] < target && target < arr[mid]) hi = mid -1;
                else lo = mid + 1;
            }
        }
        System.out.println(idx);
    }
}