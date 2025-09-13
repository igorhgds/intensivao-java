package facul;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaLigada {
    public static void main(String[] args) {
        // Definindo o número de elementos para o teste
        int numElementos = 150_000;

        // --- Teste com ArrayList ---
        System.out.println("--- INICIANDO TESTE COM ArrayList ---");
        List<String> playlistArray = new ArrayList<>();

        // 1. Carregar a Playlist (adicionar no final)
        long inicio = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            playlistArray.add("Música " + i);
        }
        long fim = System.nanoTime();
        System.out.printf("1. Tempo para adicionar %d músicas no FINAL: %.2f ms%n", numElementos, (fim - inicio) / 1_000_000.0);

        // 2. Acessar uma Música no Meio
        inicio = System.nanoTime();
        String musicaDoMeio = playlistArray.get(numElementos / 2);
        fim = System.nanoTime();
        System.out.printf("2. Tempo para ACESSAR a música do meio ('%s'): %.5f ms%n", musicaDoMeio, (fim - inicio) / 1_000_000.0);

        // 3. Adicionar uma Música no Topo (início)
        inicio = System.nanoTime();
        playlistArray.add(0, "Música TOP DO MOMENTO");
        fim = System.nanoTime();
        System.out.printf("3. Tempo para INSERIR uma música no INÍCIO: %.2f ms%n", (fim - inicio) / 1_000_000.0);

        System.out.println("\n---------------------------------------------\n");

        // --- Teste com LinkedList ---
        System.out.println("--- INICIANDO TESTE COM LinkedList ---");
        List<String> playlistLinked = new LinkedList<>();

        // 1. Carregar a Playlist (adicionar no final)
        inicio = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            playlistLinked.add("Música " + i);
        }
        fim = System.nanoTime();
        System.out.printf("1. Tempo para adicionar %d músicas no FINAL: %.2f ms%n", numElementos, (fim - inicio) / 1_000_000.0);

        // 2. Acessar uma Música no Meio
        inicio = System.nanoTime();
        musicaDoMeio = playlistLinked.get(numElementos / 2);
        fim = System.nanoTime();
        System.out.printf("2. Tempo para ACESSAR a música do meio ('%s'): %.2f ms%n", musicaDoMeio, (fim - inicio) / 1_000_000.0);

        // 3. Adicionar uma Música no Topo (início)
        inicio = System.nanoTime();
        playlistLinked.add(0, "Música TOP DO MOMENTO");
        fim = System.nanoTime();
        System.out.printf("3. Tempo para INSERIR uma música no INÍCIO: %.5f ms%n", (fim - inicio) / 1_000_000.0);

        System.out.println("\n--- FIM DOS TESTES ---");
    }
}
