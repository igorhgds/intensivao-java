package facul;

import javax.swing.*;

public class Vetor {
    public static void main(String[] args) {
        int vetSoma [] , soma = 0;
        vetSoma = new int [10];

        for (int i = 0; i < 10; i++) {
            vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma += vetSoma[i];
        }
        System.out.println("A soma dos 10 valores digitados é: " +soma);
        System.exit(0);
    }
}
