package classes_objetos_metodos.KfixitionExercicice.domain;

public class Vehicle {
    public String brand;
    public String model;
    public int year;


    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
