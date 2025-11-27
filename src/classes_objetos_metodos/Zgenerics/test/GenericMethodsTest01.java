package classes_objetos_metodos.Zgenerics.test;

import classes_objetos_metodos.Zgenerics.domain.Boat;

import java.util.Comparator;
import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithOneObject(new Boat("Big boat"));
    }

    private static <T> List<T> createArrayWithOneObject(T t){
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> createArrayWithOneObject(T t){
//        return List.of(t);
//    }
}
