// Take input percentage of a student and print the 
// Grade according to marks:
// 1) 81 - 100 Very Good
// 2) 61 - 80 Good
// 3) 41 - 60 Average
// 4) <= 40 Fail

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the percentage of student : ");
        int percentage = sc.nextInt();

        if (percentage >= 81 && percentage <= 100) {
            System.out.println("Very Good");
        } else if (percentage >= 61 && percentage <= 80) {
            System.out.println("Good");
        } else if (percentage >=41 && percentage <= 80) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}