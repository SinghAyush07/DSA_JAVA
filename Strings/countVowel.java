
import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ck = str.charAt(i);
            if(ck == 'a' || ck == 'e' || ck == 'i' || ck == 'o' || ck == 'u') {
                count++;
            }
        }

        System.out.println("Entered String : "+str);

        System.out.print("No. of Vowels = " + count+"\n");
        sc.close();
    }
}
