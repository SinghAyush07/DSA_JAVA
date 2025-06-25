// Reverse each word in a given sentence. (Don't reverse the whole string)

// Using same two pointer but with better space complexity

import java.util.Scanner;

public class revWordsMethod1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0, j = 0;
        while(j<sb.length()) {
            if(sb.charAt(j) == ' ') {
                reverse(sb, i, j-1);
                i = j+1;
                j = i;
            }
            j++;
        }
        reverse(sb,i,j-1);  // to reverse last word
        System.out.println(sb);

        sc.close();
    }

    public static void reverse(StringBuilder sb, int i, int j) {
        while(i<=j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
