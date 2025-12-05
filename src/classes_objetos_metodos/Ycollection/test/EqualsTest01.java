package classes_objetos_metodos.Ycollection.test;

import classes_objetos_metodos.Ycollection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        // Smartphone s2 = s1; -> true
        Smartphone s2 = new Smartphone("1BACN2", "Pixel"); // -> false, because reference the object(local)

        System.out.println(s1.equals(s2));

    }
}
