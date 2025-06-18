// Using two pointer and while loop swap an array

public class reverseArrayIMP {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // reversing
        int n = arr.length;
        int i = 0, j = n-1;
        // int i = 1, j = 5; // reverse a part of an array
        while(i<=j) {
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}