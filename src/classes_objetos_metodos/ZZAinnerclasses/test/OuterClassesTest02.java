package classes_objetos_metodos.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(){
        final String lastName = "Izuku"; //its final by default
        class LocalClass{
            public void printName(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
