package classes_objetos_metodos.Gassociation.test;

import classes_objetos_metodos.Gassociation.domain.Professor;
import classes_objetos_metodos.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor1, professor2};

        School school = new School("Konoha", professors);

        school.print();
    }
}
