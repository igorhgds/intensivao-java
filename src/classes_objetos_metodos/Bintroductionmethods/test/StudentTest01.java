package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Student;
import classes_objetos_metodos.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        StudentPrinter printer = new StudentPrinter();

        student01.name = "Maria";
        student01.gender = 'F';
        student01.age = 60;

        student02.name = "João";
        student02.gender = 'M';
        student02.age = 46;

        printer.print(student01);
        System.out.println("-----------------");
        printer.print(student02);

//        System.out.println("Name: " + student01.name);
//        System.out.println("Age: " + student01.age);
//        System.out.println("Gender: " + student01.gender);
//        System.out.println("--------------------------------");
//        System.out.println("Name: " + student02.name);
//        System.out.println("Age: " + student02.age);
//        System.out.println("Gender: " + student02.gender);
    }
}
