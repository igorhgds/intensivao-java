package logica_sintaxe_basica;

public class Class06LoopStatements02ForExercise {
    //Print all even number from 0 to 1000
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 1000; i+=2){
            System.out.println(i);
        }
    }
}
