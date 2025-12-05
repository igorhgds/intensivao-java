package classes_objetos_metodos.Ycollection.test;

import classes_objetos_metodos.Ycollection.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        mangas.add(new Manga(1L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(5L, "Hellsing ultimate", 9.99, 5));
        mangas.add(new Manga(3L, "berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titans", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(4L, "Dragon Ball Z", 79.99, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
