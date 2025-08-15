package logica_sintaxe_basica;

import java.time.LocalDate;


public class Class03PrimitiveTypeExercise {

    public static void main(String[] args) {

        String name = "Igor";
        String address = "199 Francisco Araujo Street";
        double salary = 1500;
        LocalDate receivedSalaryDate = LocalDate.now();

        System.out.printf("I %s, living on %s, confirm that I received the salary of %.2f on %s\n", name, address, salary, receivedSalaryDate);
    }
}
