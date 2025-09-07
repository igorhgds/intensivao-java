package classes_objetos_metodos.KfixitionExercicice.test;

import classes_objetos_metodos.KfixitionExercicice.domain.NotasAlunos;

public class NotasAlunosTest {
    public static void main(String[] args) {

        NotasAlunos aluno1 = new NotasAlunos("João", new double[]{7, 8.6, 5, 9});

        var media = aluno1.calcularMedia();
        System.out.println("O aluno " + aluno1.getNome() + " teve a média de: " + media + " e foi: ");
        aluno1.verificarAprovacao();


        NotasAlunos aluno2 = new NotasAlunos("Lucas", new double[]{7, 4.5, 6, 5});
        var media2 = aluno2.calcularMedia();
        System.out.println("O aluno " + aluno2.getNome() + " teve a média de: " +  String.format("%.2f", media2) + " e foi: ");
        aluno2.verificarAprovacao();
    }
}
