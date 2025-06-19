// Sort the arry of 0's, 1's and 2's. (Dutch Flag Algoritm)

public class DutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;

        // METHOD - I
        // we can use two pass algortihm
        // count number of 0's and 1's
        // put the counted number of 0's and 1's in
        // the given array and then fill remaining spaces with 2's
        
        // But in interview tell the following algorithm :-
        // using three pointers
        // One pass algorithm  
        int low, mid, high;
        low = 0;
        mid = 0;
        high = n-1;

        while(mid<=high) {
            if(arr[mid]==0) {
                int temp = arr[mid] ;
                arr[mid] = arr[low] ;
                arr[low] = temp;
                mid++; low++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.print("Sorted Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}