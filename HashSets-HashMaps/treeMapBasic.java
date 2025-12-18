// tree map

import java.util.TreeMap;

public class treeMapBasic {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Raghav", 76);
        map.put("Ayush", 51);
        map.put("Ram", 68);
        map.put("Ayushree", 66);
        map.put("Harish", 76);
        for(String key: map.keySet()) {
            System.out.println(key +" "+ map.get(key));
        }
    }    
}
