// find the next greatest element of the array
// using nested loop

public class nextGreatestEle {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int[] res = new int[arr.length];

        for(int i=0; i<arr.length-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<arr.length;j++){
                max = Math.max(max, arr[j]);
            }
                res[i] = max;
            }
        }
        res[arr.length-1] = -1;
        for(int ele : res ) {
            System.out.print(ele + " ");
        }
    }
}