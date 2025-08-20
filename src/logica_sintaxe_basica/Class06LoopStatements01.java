package logica_sintaxe_basica;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while, do-while and for
        int counter = 0;

        while(counter < 10){
            System.out.println(counter++);
            //counter++;
        }
        System.out.println("finished\n");

//-------------------------------------------------------------//
        counter = 0;
        do{
            System.out.println("Inside do while " + ++counter);
        }while(counter < 10);
        System.out.println("Outside do while\n");

//-------------------------------------------------------------//
        for(counter = 0; counter<10 ; counter++){
            System.out.println("Inside for " +counter);
        }

        System.out.println("\nFor i+=2");

        for(int i = 0; i<10 ; i+=2){
            System.out.println("Inside for " +i);
        }
    }
}
