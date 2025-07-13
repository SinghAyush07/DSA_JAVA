// Write a Program to print the string using recursion

public class stringTraversal {
    public static void print(int i, String s) {
        if(i == s.length()) return;
        System.out.print(s.charAt(i));
        print(i+1,s);
    }
    public static void main(String[] args) {
        String s = "Ayush Singh";
        print(0,s);
        System.out.println();
    }    
}
