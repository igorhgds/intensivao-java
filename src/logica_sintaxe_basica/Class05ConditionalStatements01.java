package logica_sintaxe_basica;

public class Class05ConditionalStatements01 {

    public static void main(String[] args){
        int age = 20;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if(isAllowedToBuyAlcohol){
            System.out.println("Authorized to buy alcohol");
        }else{
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }

        // !
        if(!isAllowedToBuyAlcohol){
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }

        boolean c = true;
        if(c == false){
            System.out.println("Inside weird conditional");
        }
        System.out.println("Outside IF");
    }
}
