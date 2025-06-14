// Given the length and breath of a rectangle, write a 
// program to find whether the area of the rectangle is
// greater than its perimeter.

import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breath of rectangle respectively : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l +b);
        if(area > perimeter) {
            System.out.println("Area of rectangle is greater than perimeter.");
        } else if (area < perimeter) {
            System.out.println("Area of rectangle is smaller than its perimeter.");
        } else {
            System.out.println("Area is equal to perimeter");
        }
    }
}