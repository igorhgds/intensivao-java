package logica_sintaxe_basica;

import java.util.Locale;

public class Class02PrimitiveTypes {

    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        int age = 27;
        long bigNumber = 10000;
        float salaryFloat = 2500.0F;
        double salaryDouble = 5000.0;
        boolean falseValue = false;
        short ageShort = 32767;
        byte ageByte = 127;
        char character = 'A';
        char character2 = '\u0041';
        char chars = 73;

        System.out.println("The age is " + age + " years old");
        System.out.printf("The age is %d years old. \n", age);
        System.out.println(chars);

        //casting (cast)
        int longNumber = (int) 10000000000L;
        float salaryFloat2 = (float) 2500.0D;
        long salaryLong = (long) 2500.35;
        System.out.println("------------------");
        System.out.println(longNumber);
        System.out.println(salaryFloat2);
        System.out.println(salaryLong);

        //String
        String name = "Igor Henrique";
        System.out.println("------------------");
        System.out.println("Hi, I am " +name.toUpperCase());


    }
}
