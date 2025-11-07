package classes_objetos_metodos.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    /*
    * O comportamento que você observou acontece porque, em Java, a passagem de parâmetros
    *  para tipos primitivos (como int, double, boolean, etc.) é sempre feita por valor.
    * Isso significa que o metodo changeTwoNumbers recebe uma cópia dos valores das
    * variáveis num1 e num2, e não as variáveis originais.
    */
    public void changeTwoNumbers(int nbr1, int nbr2) { //
        nbr1 = 99;
        nbr2 = 33;
        System.out.println("Inside changeTwoNumbers method");
        System.out.println("num1: " + nbr1);
        System.out.println("num2: " + nbr2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(double value, int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
