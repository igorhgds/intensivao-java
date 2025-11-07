package classes_objetos_metodos.Ioverrinding.test;

import classes_objetos_metodos.Ioverrinding.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        // System.out.println(anime); -> classes_objetos_metodos.Ioverrinding.domain.Anime@6acbcfc0
        // System.out.println(anime.toString()); -> the same results without toString Override

        System.out.println(anime);
    }
}
