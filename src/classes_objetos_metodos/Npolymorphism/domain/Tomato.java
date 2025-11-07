package classes_objetos_metodos.Npolymorphism.domain;

public class Tomato extends Product{

    public static final double TAX_PERCENT = 0.06;
    private String bestConsumedBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for Tomato");
        return this.price * TAX_PERCENT;
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
