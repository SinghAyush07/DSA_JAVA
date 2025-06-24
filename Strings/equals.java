

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String u = "abcxyz";
        String t = "abc";
        String v = new String(s);
        t = t + "xyz";
        System.out.println(s==u);
        System.out.println(s==t);
        System.out.println(s==v);

        System.out.println(s.equals(u));
        System.out.println(s.equals(t));
        System.out.println(s.equals(v));
    }
}
