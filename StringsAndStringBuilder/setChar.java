
import java.util.Scanner;

public class setChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        str.setCharAt(1, 'C');
        System.out.println(str);
        sc.close();
    }    
}
