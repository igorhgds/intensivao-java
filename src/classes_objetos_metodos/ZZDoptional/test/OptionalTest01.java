package classes_objetos_metodos.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello Igor, awesome course"); // don't return null
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------");

        //Optional<String> name = Optional.ofNullable(findName("igor"));
        Optional<String> name = findName("igor");
        System.out.println(name.orElse("EMPTY"));

        //Optional<String> name2 = Optional.ofNullable(findName("Igor"));
        Optional<String> name2 = findName("Igor");
        System.out.println(name2.orElse("EMPTY"));
        name2.ifPresent(s -> System.out.println(s.toUpperCase()));

        String name3 = findName("igor")
                .orElseThrow(IllegalArgumentException::new);
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Igor", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
