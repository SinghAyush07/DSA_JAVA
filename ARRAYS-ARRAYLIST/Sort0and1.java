// Sort the array of 0's and 1's

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,1,0};
        int count = 0;
        for(int ele : arr) {
            if(ele == 0){
                count++;
            }
        }
        for(int i=0; i<count; i++) {
            arr[i] = 0;
        }
        for(int i=count; i<arr.length; i++) {
            arr[i] = 1;
        }
        for(int i : arr) {
            System.out.print(i+ " ");
        }
    }
}