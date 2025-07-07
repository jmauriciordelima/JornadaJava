package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioC;

public class Pedido {

    private static int contador = 1;
    private int numeroPedido = contador;
    private String nomeCliente;
    private double valorTotal;

    public Pedido() {
        this.numeroPedido = contador++;
    }

    public Pedido(String nomeCliente, double valorTotal) {
        this();
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }


    public double aplicarDesconto(double percentual) {
        this.valorTotal -= valorTotal * percentual;

        return this.valorTotal;
    }

    public void detalhesPedido() {
        System.out.printf(
                "\n-----------------------------------" +
                        "\nDETALHES DO PEDIDO" +
                        "\nCliente: %s" +
                        "\nNumero do Pedido: %d" +
                        "\nValor total R$ %.2f%n", this.nomeCliente, this.numeroPedido, this.valorTotal);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
