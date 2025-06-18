// When we pass any integer to a function it is passed by value
// While when we pass an array to a function it is passed by reference.


public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        // the array is passed by reference
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] x) {
        x[0] = 90;   //arr[0] will change to 90
    }
}