package classes_objetos_metodos.Zgenerics.test;

import classes_objetos_metodos.Zgenerics.domain.Boat;
import classes_objetos_metodos.Zgenerics.domain.Car;
import classes_objetos_metodos.Zgenerics.service.BoatRentalService;
import classes_objetos_metodos.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

        RentalService<Car> rentalServiceCar = new RentalService<>(carsAvailable);
        Car car = rentalServiceCar.retrieveAvailableObject();
        System.out.println("using car for a month");
        rentalServiceCar.returnRentObject(car);

        System.out.println("--------------------------");
        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatAvailable);
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("using boat for a month");
        rentalServiceBoat.returnRentObject(boat);

    }
}
