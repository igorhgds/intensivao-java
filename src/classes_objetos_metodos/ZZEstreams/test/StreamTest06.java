package classes_objetos_metodos.ZZEstreams.test;

import classes_objetos_metodos.ZZEstreams.domain.LightNovel;

import java.util.*;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));     // anyMatch() return boolean
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 7));     // allMatch() return true if all the prices bigger than 7
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));    // noneMatch() return true if none price is less than 0

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny() // can find any, no order
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
