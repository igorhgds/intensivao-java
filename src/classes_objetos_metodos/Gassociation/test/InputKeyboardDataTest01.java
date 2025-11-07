package classes_objetos_metodos.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, type your full name: ");
        String name = input.nextLine(); // -> keep all the sentence or the rest of the sentence

        System.out.println("Please, type your age: ");
        int age = input.nextInt();

        System.out.println("Please, type M or F for your gender: ");
        char gender = input.next().charAt(0); // -> method to keep only first char

        // String next = input.next(); // -> only first word
        System.out.println("--------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);


    }

}
