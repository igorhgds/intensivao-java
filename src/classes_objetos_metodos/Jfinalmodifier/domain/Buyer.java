package classes_objetos_metodos.Jfinalmodifier.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return  "name='" + name + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
