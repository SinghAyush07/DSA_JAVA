import java.util.Arrays;

public class builtinMethods {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};

        Arrays.sort(arr);
        System.out.println();

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}