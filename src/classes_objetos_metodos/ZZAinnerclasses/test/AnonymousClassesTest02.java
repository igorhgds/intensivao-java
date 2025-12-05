package classes_objetos_metodos.ZZAinnerclasses.test;

import classes_objetos_metodos.Zgenerics.domain.Car;

import java.util.*;

//class CarTitleComparator implements Comparator<Car>{
//    @Override
//    public int compare(Car o1, Car o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audi")));

        cars.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); //the same result
        cars.sort(Comparator.comparing(Car::getName)); // but this is not anonymous classes

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {             //anonymous classes
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(cars);

    }
}
