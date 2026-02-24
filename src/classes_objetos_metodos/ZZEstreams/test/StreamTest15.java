package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.*;

import java.util.*;
import java.util.stream.Collectors;

import static classes_objetos_metodos.ZZEstreams.domain.Category.*;
import static classes_objetos_metodos.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static classes_objetos_metodos.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        //Map<Category, Set<Promotion>> {Fantasy = UNDER_PROMOTION, NORMAL_PRICE}
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }

}
