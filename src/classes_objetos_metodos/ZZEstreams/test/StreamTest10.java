package classes_objetos_metodos.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2) // no limit, will go crash without .limit
                .limit(10)
                .forEach(System.out::println);
        //0,1,1,2,3,5,8,21,34
        //(0,1) (1,1) (1,2) (2,3) (3,5) (5,8)...
        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println("------------------------");

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(12)
                .map(a -> a[0])
                .forEach(System.out::println);
        System.out.println("------------------------");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 1000))
                .limit(15)
                .forEach(System.out::println);
    }
}
