// Merge Sort algorithm
// Space and Time Complexity : O(nlogn)

public class mergeSort {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0, k=0;
        while(i<m && j<n) {
            if(a[i] < b[j]) {c[k] = a[i]; i++;}
            else {c[k] = b[j]; j++;}
            k++;
        }
        if(m<n) {
            while(j<n) {
                c[k] = b[j]; k++;j++;
            }
        } else {
            while(i<m) {
                c[k] = a[i]; k++; i++;
            }
        }
    }
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++) {
            a[i] = arr[i];
        }
        for(int i=0; i<n-n/2; i++) {
            b[i] = arr[n/2 + i];
        }
        //magic
        mergesort(a);
        mergesort(b);
        // merge these 'a' and 'b'
        merge(a, b, arr);
        // delete a and b -> to improve space complexity
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {80, 10, 70, 30, 60, 40, 50, 20};
        System.out.print("Origianl Array: ");
        print(arr);
        mergesort(arr);
        System.out.print("Sorted Array: ");
        print(arr);
    }
}