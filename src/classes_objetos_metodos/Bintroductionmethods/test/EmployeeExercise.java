package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Employee;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Igor");
        employee1.setAge(27);
        employee1.setSalaries(new double[] {2500.67, 987.65, 2000});

        employee1.print();

//        employee1.setAverage(123123);  privado para não deixar alterar
        System.out.println(String.format("%.2f", employee1.getAverage()));
    }
}
