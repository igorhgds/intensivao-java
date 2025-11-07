package lambdas_streams.Acollection.test;

import lambdas_streams.Acollection.domain.Manga;
import lambdas_streams.Acollection.domain.Smartphone;

import java.util.*;

class SmartphoneNameComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {  // create a custom comparator
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG")); // ERROR: need implements Comparable in the class
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(1L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(5L, "Hellsing ultimate", 9.99, 5));
        mangas.add(new Manga(3L, "berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titans", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 79.99, 0)); // in this case (Manga) it's comparable ID, cannot repeat

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------------------");

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        System.out.println("-----------------\n");
        Manga yuyuHakusho = new Manga(6L, "Yuyu Hakusho", 20.99, 0);
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(mangas.lower(yuyuHakusho));
        System.out.println(mangas.higher(yuyuHakusho));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // show and remove the first
        System.out.println(mangas.pollLast()); // show and remove the last


    }
}
