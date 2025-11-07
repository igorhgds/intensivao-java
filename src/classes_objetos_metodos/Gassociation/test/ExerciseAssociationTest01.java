package classes_objetos_metodos.Gassociation.test;

import classes_objetos_metodos.Gassociation.FixationExercise.Place;
import classes_objetos_metodos.Gassociation.FixationExercise.Professor;
import classes_objetos_metodos.Gassociation.FixationExercise.Seminar;
import classes_objetos_metodos.Gassociation.FixationExercise.Student;

import java.util.Scanner;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("5th Avenue");
        Student student = new Student("Luffy", 32);
        Student student2 = new Student("Nami", 27);
        Student[] seminarStudents = {student, student2};
        Seminar seminar = new Seminar("Finding one piece", seminarStudents ,place);
        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("White Beard", "Pirates", availableSeminars);

        professor.print();
    }
}
