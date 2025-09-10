package classes_objetos_metodos.Jfinalmodifier.domain;

public class Car {
    private String name;
    public final double SPEED_LIMIT;
    public static final double SPEED_LIMIT2 = 250; // static final -> you have to initialize before use it

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
