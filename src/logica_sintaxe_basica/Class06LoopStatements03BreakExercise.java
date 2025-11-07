package logica_sintaxe_basica;

public class Class06LoopStatements03BreakExercise {
    //Given a car's total price, for example 19500
    //I want to find how much and for how long I'll have to pay monthly.
    //Condition: The monthly payment cannot be lower than 1000
    public static void main(String[] args) {

        double totalPrice = 19500;
        double minimalMonthlyPrice = 1000;
        double additionalTax = 1.05;
        double totalPricePlusTax;

        for (int monthCount = 1; monthCount < totalPrice; monthCount++) {
            double monthlyPrice;

            if (monthCount > 5) {
                monthlyPrice = (totalPrice / monthCount) * additionalTax;
            } else {
                monthlyPrice = totalPrice / monthCount;
            }

            totalPricePlusTax = monthlyPrice * monthCount;

            if (monthlyPrice < minimalMonthlyPrice) {
                break;
            }

            System.out.printf("Months %d Price: R$ %.2f - Total: R$ %.2f\n", monthCount, monthlyPrice, totalPricePlusTax);
        }
    }
}