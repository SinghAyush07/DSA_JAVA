// copy of array

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
         int[] arr = {30,10,40,23,89,34};

         for(int i : arr) {
            System.out.print(i + " ");
         }
         System.out.println();
        
         int[] nums = arr; // here the nums has same refernce as the arr array
         // this is called shallow copy i.e nums is a shallow copy of arr
         for(int ele: nums) {
            System.out.print(ele + " ");
         }
         System.out.println();

         //nums[0] = 70;
         //System.out.println(arr[0]);
         
         // deep copy
         int[] brr = Arrays.copyOf(arr,arr.length);
         brr[0] = 70;
         for(int i : brr) {
            System.out.print(i+" ");
         }
         System.out.println();
         System.out.println(arr[0]);

         //other method to make deep copy
         int[] crr = new int[arr.length];

         for(int i=0; i<arr.length; i++) {
            crr[i] = arr[i];
         }

    }
}