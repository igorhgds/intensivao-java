package logica_sintaxe_basica;

public class Class07Arrays02 {
    public static void main(String[] args) {
        //byte, short, double, float, long, int = 0
        //char '\u0000' = ''
        //boolean = false
        // String = null
        String[] names = new String[3];

        names[0] = "Maria";
        names[1] = "Lucas";
        names[2] = "João";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("-----------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].toUpperCase());
        }
    }
}
