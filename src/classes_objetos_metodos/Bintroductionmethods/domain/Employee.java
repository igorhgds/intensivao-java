package classes_objetos_metodos.Bintroductionmethods.domain;

import java.util.Arrays;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;


    public void print() {
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (salaries != null)
            System.out.println("Salaries: " + Arrays.toString(salaries));
        else
            System.out.println("Salary: 0");

        calculateAverage();

    }

    public void calculateAverage() {
        if (salaries == null) return;

        double average = 0;
        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        System.out.printf("Avarege salary: %.2f", average);
    }
}
