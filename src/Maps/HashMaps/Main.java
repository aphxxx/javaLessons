package Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1 -> [... ... ...]
        // 2 -> [... ... ...]
        // 3 -> [... ... ...]

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

//        System.out.println(map);
//
//        map.put(3, "Other three");
//
//        System.out.println(map);
//
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
