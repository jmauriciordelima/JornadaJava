package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioC;

public class ExercicioC {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        Pedido pedido1 = new Pedido();

        pedido.setNomeCliente("Mercado Rio Doce");
        pedido.setValorTotal(3000);

        pedido.detalhesPedido();

        pedido.aplicarDesconto(0.1);

        pedido.detalhesPedido();

        pedido1.setNomeCliente("Mercearia Rio Doce");
        pedido1.setValorTotal(2000);

        pedido1.detalhesPedido();

        pedido1.aplicarDesconto(0.1);

        pedido1.detalhesPedido();

    }
}
