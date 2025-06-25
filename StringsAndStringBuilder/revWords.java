// Reverse each word in a given sentence. (Don't reverse the whole string)

import java.util.Scanner;

public class revWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String str = sc.nextLine();
        str += " ";

        // Defining a stringbuilder
        StringBuilder sb = new StringBuilder(str.length());


        // Method 1 : two pointer
        int i = 0, j = 0;
        while(i<str.length()) {
            if(str.charAt(j) == ' ') {
                StringBuilder s = new StringBuilder();
                s.append(str.substring(i, j));
                sb.append(s.reverse());
                sb.append(" ");
                i = j;
                i++;
            }
            j++;
        }
        System.out.println(sb);
        sc.close();
    }
}
