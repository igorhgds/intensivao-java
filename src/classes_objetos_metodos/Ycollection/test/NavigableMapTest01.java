package classes_objetos_metodos.Ycollection.test;

import java.util.*;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "Letter A");
        map.put("D", "Letter D");
        map.put("C", "Letter C");
        map.put("B", "Letter B");
        map.put("E", "Letter E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(map.headMap("C").remove("A")); // return the keys before the letter C ("C", true) -> inclusive "C"

        System.out.println(map); // return with the key "A" removed

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(map.ceilingKey("C")); // map.ceilingEntry() -> return value and key
    }
}
