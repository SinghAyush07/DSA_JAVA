
import java.util.Scanner;

public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        StringBuilder st = new StringBuilder(str);
        System.out.println(st);

        System.out.print("Enter the string : ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);

        sc.close();
    }
}
