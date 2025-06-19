
// Merge two sorted arrays in one single array.

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {11,33,69,72};
        int[] b = {26,54,69,81,88};
        int n = a.length, m = b.length;
        int[] c = new int[n+m];
        int i = 0, j = 0, k = 0;

        while(i<n&&j<m) {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else{
                c[k] = b[j];
                j++; 
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length) {
                c[k] = b[j];
                j++; k++;
            }
        }

        if(j == b.length) {
            while(i<a.length) {
                c[k] = a[i];
                i++; k++;
            }
        }
        for(int ele : c) {
            System.out.print(ele + 
            " ");
        }
    }
}