package logica_sintaxe_basica;

public class Class05ConditionalStatements05Switch {
    public static void main(String[] args) {
        byte day = 5;
        //char, int, byte, short, enum, String
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }


        String fruta = "maça";
        switch (fruta) {
            case "maça" -> System.out.println(fruta + " É uma fruta vermelha.");
            case "banana" -> System.out.println(fruta + " É uma fruta amarela.");
            case "laranja" -> System.out.println(fruta + " É uma fruta cítrica.");
            default -> System.out.println(fruta + " Não é uma fruta conhecida.");
        }

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Invalid gender");
        }
    }
}