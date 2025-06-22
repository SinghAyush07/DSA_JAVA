
import java.util.ArrayList;
import java.util.List;

public class TwoDimArrayList {
    public static void main(String[] args) {
      //  List<List<Integer>> v = new ArrayList<>();
        int m =4;
      //  List<List<Integer>> v = new ArrayList<>(m);
        // Creating ArrayList of mxn dimension
        int n=4;
        List<List<Integer>> v = new ArrayList<>(m);
        for(int i=0; i<m; i++){
            v.add(new ArrayList<>(n));
        }
    }
}
