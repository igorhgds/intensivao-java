package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.Category;
import classes_objetos_metodos.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

import static classes_objetos_metodos.ZZEstreams.domain.Category.*;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel);break;
                case FANTASY: fantasy.add(lightNovel);break;
                case ROMANCE: romance.add(lightNovel);break;
            }
        }
        categoryListMap.put(DRAMA, drama);
        categoryListMap.put(FANTASY, fantasy);
        categoryListMap.put(ROMANCE, romance);
        System.out.println(categoryListMap);

        // exactly the same result -------------------------------------->>>>
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
