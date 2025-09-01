package facul.pilhas_filas;

import javax.swing.*;

public class ExemploParesFila {
    public static void main(String[] args) {

        Filas intFila = new Filas(10);
        int entrada = 0;

        for (int i = 1; i <= 10; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

            if (entrada % 2 == 0){
                intFila.Enfileirar(entrada);
            }
        }
        intFila.MostrarFila();
        System.exit(0);
    }
}
