// count number of inversion using mergeSort algo

public class InversionCount{
    static int count=0;
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
            // <= for stability 
            if(a[i] <= b[j]) {c[k] = a[i]; i++;}
            else {c[k] = b[j]; j++;}
            k++;
        }
        if(i>=m) {
            while(j<n) {
                c[k] = b[j]; k++;j++;
            }
        } else {
            while(i<m) {
                c[k] = a[i]; k++; i++;
            }
        }
    }
    public static void inversioncount(int[] a, int[] b) {
        int i=0, j=0;
        while(i<a.length&&j<b.length) {
            if(a[i] > b[j]) {
                count+=a.length-i;j++;
            } else i++;
        }
    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++) b[i] = arr[n/2 + i];
        mergeSort(a);
        mergeSort(b);
        inversioncount(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
       // int[] arr = {8,2,5,3,1,4};
        int[] arr = {109,33,89,27,60,10,70};
        System.out.print("Origianl Array: ");
        print(arr);
        mergeSort(arr);
        System.out.print("Sorted Array: ");
        print(arr);
        System.out.println(count);
    }
}