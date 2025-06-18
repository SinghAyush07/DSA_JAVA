// WAP to reverse the array without using any extra array.
 

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = temp;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}