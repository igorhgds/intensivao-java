package facul.pilhas_filas;

import javax.swing.*;

public class Filas {
    int tamanho, inicio, fim, total;
    int vetor[];

    Filas(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        this.tamanho = tam;
        vetor = new int[tamanho];
    }


    public boolean FilaVazia() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean FilaCheia() {
        if (total >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public void Enfileirar(int elemento) {
        if (!FilaCheia()) {
            vetor[fim] = elemento;
            fim = fim + 1;
            total = total + 1;

            if (fim >= tamanho) {
                fim = 0;
            }
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public int Desenfileirar() {
        int desenfileirado = 0;
        if (FilaVazia()) {
            System.out.println("Fila vazia");
        } else {
            desenfileirado = vetor[inicio];
            inicio = inicio + 1;
            total = total - 1;
            if (inicio >= tamanho) {
                inicio = 0;
            }
        }
        return desenfileirado;
    }

    public int ElementoInicio() {
        if (!FilaVazia()) {
            System.out.println("O primeiro elemento é " + vetor[inicio]);
        } else {
            System.out.println("Fila Vazia");
        }
        return 0;
    }

    public void MostrarFila() {
        int aux;

        aux = inicio;
        for (int i = 0; i <= total; i++) {
            JOptionPane.showMessageDialog(null, "Elemento " + vetor[aux] + " posião " + i);
            aux = aux + 1;
            if (tamanho >= tamanho) {
                aux = 0;
            }
        }
    }
}
