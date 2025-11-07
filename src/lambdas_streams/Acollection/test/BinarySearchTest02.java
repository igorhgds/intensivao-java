package lambdas_streams.Acollection.test;

import lambdas_streams.Acollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(1L, "Pokemon", 19.99));
        mangas.add(new Manga(5L, "Hellsing ultimate", 9.99));
        mangas.add(new Manga(3L, "berserk", 29.99));
        mangas.add(new Manga(2L, "Attack on titans", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------------");

        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 89.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch)); // -> show the position - index
    }
}
