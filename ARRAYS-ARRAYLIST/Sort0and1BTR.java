// sort 0's and 1's using two pointer method 

public class Sort0and1BTR {
    public static void reverse(int[] arr, int i, int j) {
        while(i<j){
            if(arr[i] == 0) {
                i++;
            }
            else if(arr[j] == 1 ){
                j--;
            }
            else if(arr[i]==1 && arr[j]==0) {
                arr[i] = 0;
                arr[j] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        reverse(arr,0,arr.length-1);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}