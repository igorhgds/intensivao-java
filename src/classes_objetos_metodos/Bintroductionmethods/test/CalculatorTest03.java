package classes_objetos_metodos.Bintroductionmethods.test;

import classes_objetos_metodos.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(38, 3);
        System.out.println(result);

        System.out.println("---------------------------");
        calculator.printTwoNumbersDivided(56, 0);
    }
}
