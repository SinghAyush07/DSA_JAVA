// selection sort

public class selectionSort {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int mindx) {
        int temp = arr[i];
        arr[i] = arr[mindx];
        arr[mindx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);


        // Selection sort
        for(int x=0; x<arr.length-1; x++) {
            // finding minimum value
            int min = Integer.MAX_VALUE;
            int mindx =  -1;
            for(int i=x; i<arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                    mindx = i;
                }
            }
            // Swapping the values
                swap(arr, x, mindx);
        }
        print(arr);
    }
}
