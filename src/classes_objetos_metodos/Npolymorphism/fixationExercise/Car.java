package classes_objetos_metodos.Npolymorphism.fixationExercise;

public class Car extends Vehicle{

    public static final double TAX_PERCENT = 0.20;

    public Car(String name, String brand, int year, double price) {
        super(name, brand, year, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.price * TAX_PERCENT;
    }
}
