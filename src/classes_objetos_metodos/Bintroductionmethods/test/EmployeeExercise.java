package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Employee;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "Igor";
        employee1.age = 27;
        employee1.salaries = new double[] {2500.67, 987.65, 2000};

        employee1.print();
    }
}
