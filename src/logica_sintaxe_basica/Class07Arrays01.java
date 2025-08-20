package logica_sintaxe_basica;

import java.util.Arrays;

public class Class07Arrays01 {
    public static void main(String[] args) {
        int[] ages = new int[3];

        ages[0] = 12;
        ages[1] = 18;
        ages[2] = 30;
        //ages[3] = 40;
        System.out.println(ages[1]);
        System.out.println(Arrays.toString(ages));

        //-----------------------------------------------------

        System.out.print("[");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
            if (i < ages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }
}
