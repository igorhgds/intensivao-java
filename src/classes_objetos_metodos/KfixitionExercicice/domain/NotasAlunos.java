package classes_objetos_metodos.KfixitionExercicice.domain;

public class NotasAlunos {
    private String nome;
    private double[] notaAluno;

    public NotasAlunos(String nome, double[] notaAluno) {
        this.nome = nome;
        this.notaAluno = notaAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(double[] notaAluno) {
        this.notaAluno = notaAluno;
    }

    public double calcularMedia(){
        double media = 0;
        for (double nota : notaAluno) {
            media += nota;
        }
        media = media / notaAluno.length;
        return media;
    }

    public void verificarAprovacao(){
        double media = calcularMedia();
        if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
