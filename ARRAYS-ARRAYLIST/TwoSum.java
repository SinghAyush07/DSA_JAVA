// find the index of doublet in the array whose sum is equal to the given value x.(Two Sum)

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,1,8,-1};   // x = 9
        int x = 9;
        // solution
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }   
}