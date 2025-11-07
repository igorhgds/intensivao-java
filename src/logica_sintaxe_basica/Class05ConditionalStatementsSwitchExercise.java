package logica_sintaxe_basica;

public class Class05ConditionalStatementsSwitchExercise {
    // using switch, print if the day is business day or weekend
    //Giving the numbers 1 to 7, 1 being Sunday
    public static void main(String[] args) {

        byte day = 3;

        switch (day) {
            case 1 -> System.out.println("Sunday is weekend");
            case 2 -> System.out.println("Monday is business day");
            case 3 -> System.out.println("Tuesday is business day");
            case 4 -> System.out.println("Wednesday is business day");
            case 5 -> System.out.println("Thursday is business day");
            case 6 -> System.out.println("Friday is business day");
            case 7 -> System.out.println("Saturday is weekend");
            default -> System.out.println("N/A");
        }

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
