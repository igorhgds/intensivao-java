package classes_objetos_metodos.Bintroductionmethods.domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;


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

        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        System.out.printf("Avarege salary: %.2f\n", average);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

//    public void setAverage(double average) {
//        this.average = average;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getAverage() {
        return average;
    }
}
