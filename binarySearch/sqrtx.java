
import java.util.Scanner;

public class sqrtx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int lo = 0, hi = x;
        int result = 0;
        boolean flag = false;
        while(lo<=hi) {
            int mid = lo + (hi-lo) / 2;
            if(mid*mid == x) {
                result = mid;
                flag = true;
                break;
            } else if(mid*mid < x) {
                lo = mid + 1;
            } else hi = mid - 1;
        }
        if(flag == false) result = hi;
        System.out.println("Square root : " + result);
        sc.close();
    }
}