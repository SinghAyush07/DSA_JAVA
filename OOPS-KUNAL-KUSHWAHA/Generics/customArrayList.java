import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private int size=0;
    private static int DEFAULT_SIZE = 10;

    customArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        } 
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int idx) {
        return data[idx];
    }

    public int size() {
        return size;
    }

    public void set(int idx, int num) {
        data[idx] = num;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        customArrayList list = new customArrayList();
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
