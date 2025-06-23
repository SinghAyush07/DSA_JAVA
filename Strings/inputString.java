import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        // String str = sc.next();
        // System.out.println("Hi " + str);
        // System.out.print("Enter your name : ");

        String str2 = sc.nextLine();
        System.out.print("Hi " + str2);
        sc.close();
    }
}
