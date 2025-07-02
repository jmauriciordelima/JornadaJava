package Eintroducaoorientacaoobjeto.aula05.exercicioB;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.printf("O Aluno(a): %s, está: APROVADO(A), com média: %.2f", this.nome, calcularMedia());
        } else {
            System.out.printf("O Aluno(a): %s, está: REPROVADO(A), com média: %.2f", this.nome, calcularMedia());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
