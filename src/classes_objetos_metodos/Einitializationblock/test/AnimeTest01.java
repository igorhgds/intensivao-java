package classes_objetos_metodos.Einitializationblock.test;

import classes_objetos_metodos.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

//        Anime anime2 = new Anime();
//        Anime anime3 = new Anime();


    }
}
