package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.*;

import java.util.*;

import static classes_objetos_metodos.ZZEstreams.domain.Category.*;
import static classes_objetos_metodos.ZZEstreams.domain.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
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

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(groupingBy(
                ln -> getPromotion(ln)
        ));
        System.out.println(collect);

        //Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                groupingBy(StreamTest13::getPromotion)));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
