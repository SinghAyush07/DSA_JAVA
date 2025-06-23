// Input a string and Update all the even positions in the string to character 'a'. Consider 0-based indexing.

import java.util.Scanner;

public class updateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String res = "";
        for(int i=0; i<str.length(); i++) {
            if(i%2 == 0) {
                res += 'a';
            } else {
                res += str.charAt(i);
            }
        }

        System.out.print(res);

        sc.close();
    }
}
