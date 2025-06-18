// copy of array

public class copyOfArray {
    public static void main(String[] args) {
         int[] arr = {30,10,40,23,89,34};

         for(int i : arr) {
            System.out.print(i + " ");
         }
         System.out.println();
        
         int[] nums = arr; // here the nums has same refernce as the arr array
         for(int ele: nums) {
            System.out.print(ele + " ");
         }
    }
}