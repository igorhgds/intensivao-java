package lambdas_streams.Acollection.test;

import lambdas_streams.Acollection.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //LinkedHashSet<>
        mangas.add(new Manga(1L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(5L, "Hellsing ultimate", 9.99, 5));
        mangas.add(new Manga(3L, "berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titans", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
