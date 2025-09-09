// kth smallest Element in an Array

class quickSelectAlgo {
    static int ans;
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pivotIdx = lo;
        int smallerCount = 0;
        for(int i=lo; i<=hi; i++) {
            if(arr[i] <= pivot) smallerCount++;
        }
        int correctIdx = smallerCount + pivotIdx - 1;
        swap(arr, pivotIdx, correctIdx);
        int i=lo, j = hi;
        while(i<=correctIdx && j>=correctIdx) {
           if (arr[i] <= pivot) i++;
           else if (arr[j] > pivot) j--;
           else if(arr[i] > pivot && arr[j] < pivot) swap(arr, i, j);
        }
        return correctIdx;
    }
    public static void quickSelect(int[] arr, int lo, int hi, int k) {
        if(lo==hi) {
            if(lo == k-1) ans = arr[lo];
            return;
        }
        int idx = partition(arr, lo, hi);
        if(idx == k-1) {
            ans = arr[idx];
            return;
        } else if (idx > k-1) quickSelect(arr, lo, idx-1, k);
        else quickSelect(arr, idx+1, hi, k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        int k = 2;   // 4th smallest element
        ans = -1;
        quickSelect(arr, 0, n-1, k);
        System.out.println(ans);
    }
}