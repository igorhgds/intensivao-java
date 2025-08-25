package classes_objetos_metodos.Aintroductionclasses.domain;

public class Car {
    public String name;
    public String model;
    public int year;

    @Override
    public String toString() {
        return "Car {" +
                " name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
