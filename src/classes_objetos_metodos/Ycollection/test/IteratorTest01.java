package classes_objetos_metodos.Ycollection.test;

import classes_objetos_metodos.Ycollection.domain.Manga;

import java.util.*;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(5L, "Hellsing ultimate", 9.99, 5));
        mangas.add(new Manga(3L, "berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titans", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while( mangaIterator.hasNext() ) {
            Manga manga = mangaIterator.next();
            if (manga.getQuantity() == 0){
                mangaIterator.remove();
            }
        }

        mangas.removeIf(manga -> manga.getQuantity() <= 5); // -> it's better - functional programmer

        System.out.println(mangas);
    }
}
