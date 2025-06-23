
public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        // s.charAt(0) = "m"; will give error
        s = "Madhav";
        System.out.println(s);
        String t = "Madhav"; // no new string is create
        t += 10;
        System.out.print(t);
    }
}
