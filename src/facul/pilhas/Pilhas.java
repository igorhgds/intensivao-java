package facul.pilhas;

public class Pilhas {
    int tamanho;
    int topo;
    int vetor[];

    Pilhas(int tam){
        topo = -1;
        this.tamanho = tam;
        vetor = new int[tam];
    }

    public boolean PilhaVazia(){
        if (topo == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean PilhaCheia(){
        if (topo >= tamanho-1){
            return true;
        } else {
            return false;
        }
    }

    public void Empilhar(int entrada){
        if (!PilhaCheia()){
            topo = topo + 1;
            vetor[topo] = entrada;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public int Desempilhar(){
        int desempilhado = 0;

        if(PilhaVazia()){
            System.out.println("Pilha vazia");
        } else {
            desempilhado = vetor[topo];
            topo = topo - 1;
        }
        return desempilhado;
    }

    public void ElementoTopo(){
        if (topo >= 0){
            System.out.println("O elemento do topo é" + vetor[topo]);
        } else {
            System.out.println("Pilha vazia");
        }
    }

    public void MostrarPilha(){
        for (int i = topo; i >= 0 ; i--) {
            System.out.println("Vetor elemento: " + vetor[i] + " posição " + i);
        }
    }
}
