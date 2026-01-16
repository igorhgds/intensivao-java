package classes_objetos_metodos.ZZClambdas.test;

import classes_objetos_metodos.ZZClambdas.domain.Anime;
import classes_objetos_metodos.ZZClambdas.service.AnimeComparators;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        //Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;

        AnimeComparators animeComparators = animeComparatorsSupplier.get();

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 40), new Anime("One Piece", 900), new Anime("Naruto", 500), new Anime("FullMetal", 30)));

        animes.sort(animeComparators::comparedByEpisodeNonStatic);
        System.out.println(animes);

        System.out.println("----------------");
        Supplier<LocalDateTime> now = LocalDateTime::now;
        System.out.println(now);
        System.out.println(now.get());
    }
}
