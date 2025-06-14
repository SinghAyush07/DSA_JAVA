// If cost price and selling price of an item is input
// throught the keyboard, write a program to determine 
// whether the seller has made profit or incurred loss 
// or no profit no loss. Also determine how much profit
// he made or loss he incurred.

import java.util.Scanner;

class profit_loss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("Profit : " + (sp - cp));
        }  else if (sp < cp) {
            System.out.println("Loss : " + (cp - sp));
        }   else {
            System.out.println("Neither Profit nor Loss.");
        }
        sc.close();
    }
}