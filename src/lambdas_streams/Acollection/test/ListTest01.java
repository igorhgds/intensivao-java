package lambdas_streams.Acollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> list2 = List.of("1", "2", "3", "4");

        List<String> names = new ArrayList<>();
        names.add("Joao");
        names.add("Maria");

        System.out.println(names.remove(1));

//      for (String l : list2){
//          names.add(l);
//      }
        names.addAll(list2);

        for(String name : names){
            System.out.println(name);
        }

        names.add("Igor");
        System.out.println("--------------------");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
