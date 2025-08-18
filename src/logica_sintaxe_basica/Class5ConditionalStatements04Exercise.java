package logica_sintaxe_basica;

public class Class5ConditionalStatements04Exercise {
    public static void main(String[] args) {
        double annualSalary = 70000D;

        double firstBracket = 9.70 / 100;
        double secondBracket = 37.35 / 100;
        double thirdBracket = 49.5 / 100;
        double amountToBePaid;

        if(annualSalary <= 34712){
            amountToBePaid = annualSalary * firstBracket;
        }else if(annualSalary > 34712 && annualSalary <= 68507){
            amountToBePaid = annualSalary * secondBracket;
        }else {
            amountToBePaid = annualSalary * thirdBracket;
        }

        System.out.println("Amount to be paid: " + amountToBePaid);
    }
}
