package classes_objetos_metodos.Dconstructor.test;

import classes_objetos_metodos.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Finished");
        Anime anime1 = new Anime("Naruto", "TV", 12, "Finished", "Production IG");
        Anime anime2 = new Anime();

        anime.print();
        System.out.println("--------------");
        anime1.print();
        System.out.println("--------------");
        anime2.print();
    }
}
