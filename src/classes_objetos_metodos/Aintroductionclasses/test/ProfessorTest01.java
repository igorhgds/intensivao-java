package classes_objetos_metodos.Aintroductionclasses.test;

import classes_objetos_metodos.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Kami";
        professor.age = 150;
        professor.gender = 'M';

        System.out.println("Name: " +professor.name + ", Age: " +professor.age  + ", Gender: " +professor.gender);
    }
}
