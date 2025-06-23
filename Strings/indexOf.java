
import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.print("Enter the character whose index is needed to be found : ");
        char c = sc.next().charAt(0);

        System.out.print("Index : " + str.indexOf(c)+" " + str.lastIndexOf(c));

        sc.close();
    }
}
