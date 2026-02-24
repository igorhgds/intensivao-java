package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.*;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static classes_objetos_metodos.ZZEstreams.domain.Category.*;
import static classes_objetos_metodos.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static classes_objetos_metodos.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, FANTASY),
            new LightNovel("Overlord", 3.99, FANTASY),
            new LightNovel("Violet Evergarden", 5.99, DRAMA),
            new LightNovel("No game no life", 2.99, FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Kumo desuga", 10.99, FANTASY),
            new LightNovel("Monogatari", 4, ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        //to avoid Optional<LightNovel> ⚠️ But is this dangerous?
        //Yes — if there is any category without elements, it will throw: NoSuchElementException
        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                        Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
