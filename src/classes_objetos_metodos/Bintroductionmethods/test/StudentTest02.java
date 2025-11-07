package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Maria";
        student01.gender = 'F';
        student01.age = 60;

        student02.name = "João";
        student02.gender = 'M';
        student02.age = 46;

        student01.print();
        student02.print();
    }
}
