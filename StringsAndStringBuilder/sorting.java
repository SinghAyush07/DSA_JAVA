import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = s.toCharArray();
        for(char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();

        StringBuilder sb = new StringBuilder("Singh");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for(char ele : arr) {
            System.out.print(ele);
        }
        System.out.println();
    }
}
