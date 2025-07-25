// Merge Sort algorithm
// Space and Time Complexity : O(nlogn)

public class mergeSort {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(j<b.length) c[k++] = b[j++];
        while(i<a.length) c[k++] = a[i++];
    }
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n==1) return;   // base case
        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        
        for(int i=0; i<n/2; i++) {
            a[i] = arr[i];
        }
        for(int i=0; i< (n-n/2); i++) {
            b[i] = arr[n/2 + i];
        }
        // magic
        mergesort(a);
        mergesort(b);

        // merge these 'a' and 'b'
        merge(a, b, arr);
    }
    public static void main(String[] args) {
        int[] arr = {80,30,50,20,60,10,70,40};

        System.out.print("Array : ");
        print(arr);

        mergesort(arr);
        System.out.print("Sorted Array : ");
        print(arr);
    }    
}
