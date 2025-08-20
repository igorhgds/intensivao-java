package logica_sintaxe_basica;

public class Class06LoopStatements03Break {
    //Given a total number, for example 50 and print the first 25 numbers
    public static void main(String[] args) {
        int maxNumber = 50;

        for (int i = 0; i <= maxNumber; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
            System.out.println("Outside if " + i);
        }
        System.out.println("Outside for");

        //------------------------simplified----------------------------------//
        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside for");
    }
}
