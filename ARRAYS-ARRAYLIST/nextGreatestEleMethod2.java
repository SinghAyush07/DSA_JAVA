// Find next greatest element
// Method 2 : optimised method

public class nextGreatestEleMethod2 {
    public static void main(String[] args) {
        int[] arr = {12,8,60,37,2,49,16,28,21};
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1; 
        int neg = arr[arr.length-2];
        for(int i=arr.length-2; i>=0; i--) {
            res[i] = neg;
            neg = Math.max(neg, arr[i]);
        }

        for(int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
