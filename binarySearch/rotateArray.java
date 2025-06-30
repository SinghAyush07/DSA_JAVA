// Search in Rotated Sorted Array

public class rotateArray {
    public static int search(int[] arr, int lo, int hi, int target) {
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        // the array is rotated at some pivot
        // in that array find if the target exists or not

        // Method 1 : Find the pivot index
        int[] arr = {3,4,5,6,7,0,1,2};
        int lo=1, hi = arr.length - 2;
        int target = 5;
        // find pivot
        int n = arr.length;
        int p=-1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                p = mid; break;
            } else if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) {
                p = mid - 1;
                break;
            } else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                if(arr[mid] > arr[n-1]) lo = mid +1;
                else hi = mid -1;
            }
        }
        // after find the pivot apply binary search on both sides
        // that is first search in 0 to pivot and then search in pivot to n-1;

        // 0 -> p
        int idx = -1;
        idx = search(arr, 0, p, target);
        if(idx == -1) idx = search(arr, p+1, n-1, target);
        System.out.println(idx);
    }    
}