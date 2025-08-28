package facul;

import javax.swing.*;

public class TesteFacul {
    public static void main(String[] args) {
        int VetSoma [] , soma = 0;
        VetSoma = new int [10];

        for (int i = 0; i < 10; i++) {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma += VetSoma[i];
        }
        System.out.println("A soma dos 10 valores digitados é: " +soma);
        System.exit(0);
    }
}
