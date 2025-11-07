package logica_sintaxe_basica;

public class Class04OperatorsExercise {

    public static void main(String[] args) {

        validacaoCompra();

        conversorTemperatura();

        validadorSenha();

    }

    private static void validacaoCompra(){
        double valorCompra = 150.00;
        int idade = 25;
        boolean clienteOuro = true;


        boolean temDireitoADesconto = valorCompra > 100.00 && (idade >= 18 || clienteOuro);

        System.out.println("temDireitoADesconto: " + temDireitoADesconto);
    }

    private static void conversorTemperatura(){
        double temperaturaCelsius = 25.0;
        double limiteFahrenheit = 77.0;

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        boolean acimaDoLimite = !((temperaturaFahrenheit) <= limiteFahrenheit);

        System.out.println("temperaturaFahrenheit: " + temperaturaFahrenheit);
        System.out.println("acimaDoLimite: " + acimaDoLimite);
    }

    private static void validadorSenha(){
        boolean temLetraMaiuscula = true;
        boolean temNumero = false;
        int comprimentoSenha = 8;
        boolean temSimboloEspecial = true;

        boolean senhaForte = comprimentoSenha >= 8 && temLetraMaiuscula && (temNumero || temSimboloEspecial);

        System.out.println("senhaForte: " + senhaForte);
    }
}
