package facul;

import javax.swing.*;

public class Recursao {
    public static void main(String[] args) {
        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (nro < 0){
            System.out.println("Valor inválido para o cálculo de fatorial, o valor precisa ser maior ou igual a zero");
        }else {
            FatorialP.fatP(nro, nro, 1);
        }

        //-----------------------------------------------------------------------------------

        int f, num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (num < 0){
            System.out.println("Valor inválido para o cálculo de fatorial, o valor precisa ser maior ou igual a zero");
        } else {
            f = Fatorial.fat(num);
            System.out.println("Fatorial de " + num + " é " + f);
        }

    }

    //Sem Calda
    private class FatorialP{
       static void fatP(int n, int x, int f){
           if (x == 0 || x == 1){
               System.out.println("O fatorial de " + n + " é " + f);
           } else {
               fatP(n, x-1, f * x); //chamada função recursiva
           }
       }
    }

    //Com Calda
    private class Fatorial{
        static int fat (int n){
            int f;
            if (n == 0){
                return 1;
            }else {
                f = n * fat(n-1);
                return f;
            }
        }
    }
}
