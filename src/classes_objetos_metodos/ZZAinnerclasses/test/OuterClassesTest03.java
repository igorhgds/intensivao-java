package classes_objetos_metodos.ZZAinnerclasses.test;

public class OuterClassesTest03 {

    protected String name = "Igor";

    static class Inner {
        public void printOuterClassAttribute() {
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }

}
