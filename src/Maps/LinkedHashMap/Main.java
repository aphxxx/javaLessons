package Maps.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // the order isn't guaranteed

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // the order is guaranteed

        Map<Integer, String> treeMap = new TreeMap<>(); // the key value pair is sorted by key

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Alex");
        map.put(0, "fsgdfg");
        map.put(1543, "gdsfg");
        map.put(7, "kirilltretyakovv");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() );

        }

        System.out.println("  ");
    }
}
