package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioB;

public class Funcionario {

    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double aumentarSalario(double percentual) {

        System.out.printf("Salário antes do ajuste R$ %.2f%n", getSalario());

        this.salario += this.salario + (percentual / 100);

        System.out.printf("Salário pós ajuste R$ %.2f%n", getSalario());

        return salario;
    }

    public void exibirFuncionario() {
        System.out.println("\n" +
                        "----------------------------\n" +
                        "Nome: " + this.nome + "\n" +
                        "Salário R$ " + this.salario + "\n" +
                        "Cargo: " + this.cargo + "\n" +
                        "\n----------------------------"
                );

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
