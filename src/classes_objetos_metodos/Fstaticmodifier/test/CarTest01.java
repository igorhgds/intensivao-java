package classes_objetos_metodos.Fstaticmodifier.test;

import classes_objetos_metodos.Fstaticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        //System.out.println(Car.speedLimit);
        System.out.println(Car.getSpeedLimit());

        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("Audi", 290);

        //car1.setSpeedLimit(180); // -> by setting this value to a static attribute, this attribute references all objects
        car1.print();

        //Car.speedLimit = 200;
        Car.setSpeedLimit(180);



        car2.print();
        car3.print();
    }
}
