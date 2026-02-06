package classes_objetos_metodos.ZZEstreams.test;

import java.util.*;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Junior");
        List<String> developers = List.of("William", "Igor", "Harisson");
        List<String> students = List.of("Gustavo Lima", "Igor Henrique", "Gabriel Pereira");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        System.out.println(devdojo);
        System.out.println("----------");

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("--------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
