package classes_objetos_metodos.Zgenerics.service;

import classes_objetos_metodos.Zgenerics.domain.Car;

import java.util.List;

public class RentalService<T> {

    private List<T> objectAvailable;

    public RentalService(List<T> objectAvailable) {
        this.objectAvailable = objectAvailable;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for any object available");
        T t = objectAvailable.remove(0);
        System.out.println("Renting the object: " + t);
        System.out.println("Available cars to rent: " + objectAvailable);
        return t;
    }

    public void returnRentObject(T t) {
        System.out.println("Returning object: " + t);
        objectAvailable.add(t);
        System.out.println("Available objects to rent: " + objectAvailable);
    }
}
