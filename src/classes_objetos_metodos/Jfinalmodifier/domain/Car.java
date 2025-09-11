package classes_objetos_metodos.Jfinalmodifier.domain;

public class Car {  // public final class Car cannot extends other class
    private String name;
    public final double SPEED_LIMIT;
    public static final double SPEED_LIMIT2 = 250; // static final -> you have to initialize before use it
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println(this.name);
    }

    public Car() {
        SPEED_LIMIT = 250;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
