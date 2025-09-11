package classes_objetos_metodos.KfixitionExercicice.test;

import classes_objetos_metodos.KfixitionExercicice.domain.Motorcycle;
import classes_objetos_metodos.KfixitionExercicice.domain.Car;
import classes_objetos_metodos.KfixitionExercicice.domain.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle("Haojue", "Master Ride", 2024);
        System.out.println(motorcycle);

        Car car = new Car("Ferrari", "Enzo", 2004);
        System.out.println(car);

        Vehicle motorcycle2 = new Motorcycle("Honda", "Titan", 2022);
        Vehicle car2 = new Car("Volkswagen", "Polo", 2020);

        System.out.println(motorcycle2);
        System.out.println(car2);

    }
}
