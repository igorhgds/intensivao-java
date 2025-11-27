package classes_objetos_metodos.Zgenerics.test;

import classes_objetos_metodos.Zgenerics.domain.Car;
import classes_objetos_metodos.Zgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {

        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();

        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);

    }
}
