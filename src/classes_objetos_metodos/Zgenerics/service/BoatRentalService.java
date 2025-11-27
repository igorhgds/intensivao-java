package classes_objetos_metodos.Zgenerics.service;

import classes_objetos_metodos.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

    public Boat retrieveAvailableBoat() {
        System.out.println("Searching for any boat available");
        Boat boat = boatAvailable.remove(0);
        System.out.println("Renting: " + boat);
        System.out.println("Available boats to rent: " + boatAvailable);
        return boat;
    }

    public void returnRentBoat(Boat boat) {
        System.out.println("Returning boat: " + boat);
        boatAvailable.add(boat);
        System.out.println("Available boats to rent: " + boatAvailable);
    }
}
