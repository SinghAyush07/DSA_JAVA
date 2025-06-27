

public class bubblesort {
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};         //{7,1,2,8,-4};

        int[] brr = {5,8,1,-3,8,10};
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        //sorting barr
        // Bubble pass
        int n = brr.length;
        for(int x=1; x<=n-1; x++) {     // n-1 passes
            for(int i=0; i<brr.length-1; i++) {
            if(brr[i] > brr[i+1]) {
                int temp = brr[i];
                brr[i] = brr[i+1];
                brr[i+1] = temp;
                }
            }
        }

        print(brr);
    }
}
