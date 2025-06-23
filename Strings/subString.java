// substring(i) and substring(i,j)
// substring is continous part of the string

public class subString {
    public static void main(String[] args) {
        String s =  "abcde";
        System.out.println(s.substring(3)); // prints 3 and aage wale index
        // bcde

        System.out.println(s.substring(1,4)); // bcd
        System.out.println(s.substring(2,2)); // prints nothing
        System.out.println(s.substring(0, 5));
    }
}
