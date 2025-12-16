// Iterating over HashMaps using for each loop and map.keySet()

import java.util.HashMap;

public class mapIterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Ayush", 51);
        map.put("Ram", 68);
        map.put("Ayushree", 66);
        map.put("Harish", 76);
        map.get("Raghav");
        // print keys
        for(String key:map.keySet()) {
            int val = map.get(key);
            System.out.print(key+"-"+val+ "  ");
        }
        System.out.println();
        // print values
        for(int val: map.values()) {
            System.out.print(val+ " ");
        }
        System.out.println();
        for(Object pair:map.entrySet()) {
            System.out.print(pair+" ");
        }
    }    
}
