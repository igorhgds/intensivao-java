package classes_objetos_metodos.Npolymorphism.fixationExercise;

public class Motorcycle extends Vehicle{

    public static final double TAX_PERCENT = 0.10;

    Motorcycle(String name, String brand, int year, double price) {
        super(name, brand, year, price);
    }

    @Override
    public double calculateTaxValue() {
        return this.getPrice()*TAX_PERCENT;
    }
}
