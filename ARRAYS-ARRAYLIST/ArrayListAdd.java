
import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " "+ list.size());
        list.add(60);
        System.out.println(list+" " + list.size());
        list.add(20);
        System.out.println(list+" " + list.size());
        list.remove(1);
        System.out.println(list+" " + list.size());
    }
}