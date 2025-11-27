package classes_objetos_metodos.Zgenerics.test;

import classes_objetos_metodos.Zgenerics.domain.Boat;
import classes_objetos_metodos.Zgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {

        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();

        System.out.println("Using the boat for an entire month");
        boatRentalService.returnRentBoat(boat);

    }
}
