package classes_objetos_metodos.Aintroductionclasses.test;

import classes_objetos_metodos.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 27;
        student.gender = 'M';
        student.name = "Igor";

        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student.name);
    }
}
