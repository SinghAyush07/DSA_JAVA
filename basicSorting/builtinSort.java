
import java.util.Arrays;

public class builtinSort {
    public static void main(String[] args) {
        int[] arr = {7,1,2,8,-4};
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        Arrays.sort(arr);           // Builtin sorting method
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}