
import java.util.Scanner;

public class appendStrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the first String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        System.out.print("Enter String to be appended : ");
        String ap = sc.nextLine();

        str.append(ap);
        str.append(40);
        System.out.println(str);
        char[] ch = {'r', 'a', 'g'};
        str.append(ch);
        System.out.println(str);
        // int[] arr = {1, 2, 3};
        // str.append(arr);   -> does not work address is appended
        // System.out.print(str);

        StringBuilder t = new StringBuilder("pqr");
        str.appen(t);
        System.out.println(str);
        sc.close();
        // str += "fqsa" not possible
    }
}
