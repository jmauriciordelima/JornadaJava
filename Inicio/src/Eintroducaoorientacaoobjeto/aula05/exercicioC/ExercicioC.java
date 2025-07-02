package Eintroducaoorientacaoobjeto.aula05.exercicioC;

import java.util.Scanner;

public class ExercicioC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ContaBancaria cb = new ContaBancaria();

        Menu menu = new Menu();

        int opcao = -1;

        System.out.print("Informe o nome: ");
        cb.setTitular(entrada.nextLine());
        System.out.print("Informe o número da conta: ");
        cb.setNumeroConta(entrada.nextInt());
        System.out.print("Informe o saldo R$ ");
        cb.setSaldo(entrada.nextDouble());

        cb.cadastrar(cb.getTitular(), cb.getNumeroConta(), cb.getSaldo());

        System.out.println("\n-------- Bem vindo(a) -------- \n");

        do {

            menu.informacoes();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Infome o valor de depósito R$ ");
                    cb.depositar(entrada.nextDouble());
                    break;
                case 2:
                    System.out.print("Infome o valor do saque R$ ");
                    cb.sacar(entrada.nextDouble());
                    break;
                case 3:
                    cb.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Até logo. Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");

            }

        } while (opcao != 0);
    }
}
