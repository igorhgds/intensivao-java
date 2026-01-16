package classes_objetos_metodos.ZZClambdas.test;

import classes_objetos_metodos.ZZClambdas.domain.Anime;
import classes_objetos_metodos.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("One Piece", 900), new Anime("Naruto", 500), new Anime("FullMetal", 30)));

        AnimeComparators animeComparators = new AnimeComparators();
        //animes.sort((a1, a2) -> animeComparators.comparedByEpisodeNonStatic(a1, a2));

        animes.sort(animeComparators::comparedByEpisodeNonStatic);

        System.out.println(animes);

    }
}
