// Input a string and toggle all the characters of it. (Replace small case with capital case & vice versa)

import java.util.Scanner;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;

            if(ascii>=65 && ascii<=90) {
                ascii += 32;
            }else if(ascii>=97 && ascii<=122) {
                ascii -= 32;
            }
            ch = (char)ascii;
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
        sc.close();
    }
}
