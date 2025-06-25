// insert() and deletecharAt()

public class inserAnDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.append("xyz");  //abcefxyz -> cefx (2,3)
        sb.delete(2, 6); // deletes characters from 2 to 5
        // Java mein ek index zada dena pdta hai
        System.out.println(sb);   //abyz -> abgyz
        sb.insert(2,"g");
        System.out.println(sb);
    }
}
