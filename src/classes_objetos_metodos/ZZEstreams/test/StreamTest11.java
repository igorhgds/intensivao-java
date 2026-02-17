package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 10.99),
            new LightNovel("Monogatari", 4)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        //System.out.println((long) lightNovels.size());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
        //System.out.println((Long) lightNovels.stream().count()); -> the same thing

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getTitle))).ifPresent(System.out::println); // --> the same thing

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice))); // --> exactly the same thing

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect); // DoubleSummaryStatistics{count=8, sum=45.930000, min=1.990000, average=5.741250, max=10.990000}

        Stream<String> stringStream = lightNovels.stream().map(LightNovel::getTitle);
        System.out.println(stringStream); // java.util.stream.ReferencePipeline$3@1a86f2f1
        List<String> collect1 = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.toList());
        System.out.println(collect1); //[Tensei Shittara, Overlord, Violet Evergarden, No game no life, Fullmetal Alchemist, Kumo desuga, Kumo desuga, Monogatari]

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
