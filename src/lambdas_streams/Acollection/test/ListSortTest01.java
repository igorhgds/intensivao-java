package lambdas_streams.Acollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing ultimate");
        mangas.add("berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titans");
        mangas.add("Dragon Ball Z");
        System.out.println(mangas);

        Collections.sort(mangas);  // capital letter have preference
        System.out.println(mangas);

        List<Double> values = new ArrayList<>();
        values.add(110.21);
        values.add(21.21);
        values.add(23.098);
        values.add(98.91);
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
    }
}
