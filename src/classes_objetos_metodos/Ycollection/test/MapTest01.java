package classes_objetos_metodos.Ycollection.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //LinkedHashMap<>() -> keep order add
        map.put("keuboard", "keyboard");
        map.put("mousw", "mouse");
        map.putIfAbsent("mousw", "mouse22"); // this case not override
        map.put("yoi", "you");
        map.put("yoi", "you22"); // this override the last one, cannot repeat the key

        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-----------------");

        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("-----------------");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
