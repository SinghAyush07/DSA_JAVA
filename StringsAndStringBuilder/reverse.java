// Take input a StringBuilder and reverse it using builtin function

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0; i<sb.length()/2; i++) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt((sb.length()-1-i), ch);
        }
        System.out.println(sb);
        sc.close();
    }
}
