package facul.pilhas;

import javax.swing.*;

public class Exemplo1 {
    public static void main(String[] args) {
        Pilhas intPilha = new Pilhas(5);
        int entrada;

        for (int i = 1; i <= 5; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            intPilha.Empilhar(entrada);
        }
        intPilha.MostrarPilha();
        System.exit(0);
    }
}
