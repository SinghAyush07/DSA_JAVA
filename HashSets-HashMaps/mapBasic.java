// Hashmaps basics

import java.util.HashMap;

public class mapBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Ayush", 51);
        map.put("Ram", 68);
        map.put("Ayushree", 66);
        System.out.println(map);
        // System.out.println(map.containsValue(51));
        // map.put("Raghav", 100);
        map.put("Harish", 76);
        System.out.println(map);
        System.out.println(map.containsValue(76));
        System.out.println(map.size());
        map.remove("Raghav");
        System.out.println(map + " " + map.size());
        System.out.println(map.get("Ayush"));
    }
}