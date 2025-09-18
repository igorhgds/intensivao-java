package classes_objetos_metodos.Npolymorphism.fixationExercise;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Enzo", "Ferrari", 2004, 70000);
        Motorcycle motorcycle = new Motorcycle("Master Ride", "Haojue", 2024, 15000);

        System.out.println(car.calculateTaxValue());
        System.out.println(motorcycle.calculateTaxValue());

        System.out.println(car.toString());
    }
}