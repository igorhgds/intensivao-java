package classes_objetos_metodos.ZZClambdas.test;

import classes_objetos_metodos.ZZClambdas.domain.Anime;
import classes_objetos_metodos.ZZClambdas.service.AnimeComparators;

import java.util.*;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("One Piece", 900), new Anime("Naruto", 500), new Anime("FullMetal", 30)));

        //animes.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animes.sort(Comparator.comparing(Anime::getTitle)); //method reference
        System.out.println(animes);

        animes.sort((a1, a2) -> AnimeComparators.comparedByTitle(a1, a2));
        //animes.sort(AnimeComparators::comparedByTitle); //method reference

        System.out.println("---------EPISODE-----------");

        animes.sort(AnimeComparators::comparedByEpisode); //method reference
        System.out.println(animes);
    }

}
