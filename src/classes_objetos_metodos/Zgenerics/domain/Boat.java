package classes_objetos_metodos.Zgenerics.domain;

public class Boat {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }
}
