package classes_objetos_metodos.Aintroductionclasses.test;

import classes_objetos_metodos.Aintroductionclasses.domain.Car;

public class CarTest01Exercise {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ferrari";
        car1.model = "Enzo";
        car1.year = 2007;
        System.out.println(car1);

        System.out.println("-------------");

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;
        System.out.println(car2);
    }
}
