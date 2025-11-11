package lambdas_streams.Bgenerics.test;

import java.util.*;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        //printConsult(dogs); -> ERROR
        List<Animal> animals = new ArrayList<>(2);
        List<Objects> objects = new ArrayList<>(2);
        printConsult(animals);
        printConsult(dogs);
        printConsult(cats);
        printConsultDog(animals);
    }

    private static void printConsult(List<? extends Animal> animals){
        System.out.println("--------------");

        for (Animal animal : animals){
            animal.consult();
        }
    }

    private static void printConsultDog(List<? super Animal> animals){
        System.out.println("--------------");

        for (Object obj : animals){
            if (obj instanceof Dog){
                Dog d = (Dog) obj;
                d.consult();
            }
        }
    }
}
