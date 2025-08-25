package classes_objetos_metodos.Aintroductionclasses.test;

import classes_objetos_metodos.Aintroductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Goku";
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);

        System.out.println("-----------");

        student2.gender = 'M';
        System.out.println(student2.age);
        System.out.println(student2.name);
        System.out.println(student2.gender);
    }
}
