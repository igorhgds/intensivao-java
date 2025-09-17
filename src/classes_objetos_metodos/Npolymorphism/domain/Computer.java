package classes_objetos_metodos.Npolymorphism.domain;

public class Computer extends Product{

    public static final double TAX_PERCENT = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for Computer");
        return this.price * TAX_PERCENT;
    }
}
