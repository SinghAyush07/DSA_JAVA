import java.util.ArrayList;
import java.util.List;

public class ArrayListTwo {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(a); grid.add(b); grid.add(c); grid.add(d);

        // Print the array list grid
        for(int i=0; i<grid.size(); i++) {
            List<Integer> x = grid.get(i);
            for(int j=0; j<x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
