package classes_objetos_metodos.Jfinalmodifier.test;

import classes_objetos_metodos.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.SPEED_LIMIT);
        System.out.println(car.BUYER); // classes_objetos_metodos.Jfinalmodifier.domain.Buyer@5f184fc6
        car.BUYER.setName("Juan");
        System.out.println(car.BUYER);
    }
}
