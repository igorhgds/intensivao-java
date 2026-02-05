package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)
    ));

    public static void main(String[] args) {
        //lightNovels.stream().forEach(System.out::println);
        lightNovels.forEach(System.out::println);
        System.out.println("----------------");

        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream
                .filter(ln -> ln.getPrice() <= 4) // when use stream, its start and closed
                .count();                                   // throw exception
        System.out.println(count);

        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 6) // for to use again, is necessary start with lightNovels.stream()
                .count();
        System.out.println(count2);

    }
}
