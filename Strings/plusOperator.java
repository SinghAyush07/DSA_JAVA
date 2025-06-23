public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s += t;     // s = abcpqr
        System.out.println(s);
        s = s + 10;
        System.out.println(s);
        s = 10 + s;
        System.out.println(s);

        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");

        // in both cases the answer is string
        // in first case the 10 is appended as string and the 20 is appended as string
        // in second case first the int 10 and int 20 is added and then it is appended to string
    }
}
