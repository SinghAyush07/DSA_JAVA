 
 import java.util.Scanner;

 public class printOnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number N :");
        int N = sc.nextInt();

        for(int i=1; i <= N; i++){
            System.out.println(i);
        }
        sc.close();
    }
 }