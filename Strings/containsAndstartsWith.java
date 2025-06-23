
import java.util.Scanner;

public class containsAndstartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.print("Enter the contain part : ");
        String contain = sc.nextLine(); // substring

        System.out.println(str.contains(contain));

        System.out.print("Enter the starting check : ");
        String start = sc.nextLine();

        System.out.print(str.startsWith(start));

        sc.close();
    }
}
