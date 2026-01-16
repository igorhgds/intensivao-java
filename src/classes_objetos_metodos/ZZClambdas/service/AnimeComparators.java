package classes_objetos_metodos.ZZClambdas.service;

import classes_objetos_metodos.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int comparedByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int comparedByEpisode(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int comparedByEpisodeNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
