
public class StringBuilderInJava {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Raghav");
        System.out.println(sb);
        StringBuilder x = new StringBuilder();
        System.out.println(x.length());
        StringBuilder a = new StringBuilder(10);
        System.out.println(x.capacity());
        System.out.println(a.capacity());

    }
}