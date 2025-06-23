// toLowerCase() and toUpperCase() , also Concat

import java.util.Scanner;

public class caseChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        // converting to lower case
        String lwr = str.toLowerCase();
        // converting to upper case
        String upr = str.toUpperCase();
        // concating both
        String conc = lwr.concat(upr);
        System.out.println(lwr);
        System.out.println(upr);
        System.out.println(conc);

        sc.close();
    }
}