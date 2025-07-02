package Eintroducaoorientacaoobjeto.aula05.exercicioC;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public void cadastrar(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente...");
        } else {
            saldo -= valor;
            System.out.printf("Titular: %s, NºConta: %d%n", this.titular, this.numeroConta);
            System.out.printf("Seu saldo agora é de: R$ %.2f%n", this.saldo);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Seu saldo atua é de R$ %.2f%n", this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
