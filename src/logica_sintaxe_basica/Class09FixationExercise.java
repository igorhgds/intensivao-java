package logica_sintaxe_basica;

public class Class09FixationExercise {
    public static void main(String[] args) {

        double[] aluno1 = new double[]{8, 9, 5};
        double[] aluno2 = new double[]{7, 9, 10, 6};
        double[] aluno3 = new double[]{7, 9, 10, 6};

        double notaAluno1 = 0;
        double notaAluno2 = 0;
        double notaAluno3 = 0;


        for (int i = 0; i < aluno1.length; i++) {
            notaAluno1 += aluno1[i];
        }
        notaAluno1 = notaAluno1 / aluno1.length;
        System.out.printf("Nota aluno 1: %.2f", notaAluno1);

        for (int i = 0; i < aluno2.length; i++) {
            notaAluno2 += aluno2[i];
        }
        notaAluno2 = notaAluno2 / aluno2.length;
        System.out.printf("\nNota aluno 2: %.2f", notaAluno2);

        System.out.println("\n-------------foreach------------");

        for (double nota : aluno3){
            notaAluno3 += nota;
        }
        notaAluno3 = notaAluno3 / aluno3.length;
        System.out.printf("Nota aluno 3: %.2f", notaAluno3);
    }
}
