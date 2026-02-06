package classes_objetos_metodos.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------------------");
        // final Stream<String> stream = Arrays.stream(letters);

        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .toList();
        System.out.println(collect);
    }
}
