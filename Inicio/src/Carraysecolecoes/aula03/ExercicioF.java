package Carraysecolecoes.aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        int opcao = -1;

        do {

            System.out.println(menu());
            System.out.println("\n-----------------------------\n");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    entrada.nextLine();
                    System.out.print("Adicione um nome: ");
                    nomes.add(entrada.nextLine());
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Informe o nome a ser removido: ");
                    nomes.remove(entrada.nextLine());
                    break;
                case 3:
                    for (String nome : nomes) {
                        System.out.println(nome);
                    }
                    System.out.println("\n-----------------------------\n");
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

    }

    static String menu() {

        String menu = ("Escola uma das opções a seguir: \n" +
                "1 - Adicionar nome: \n" +
                "2 - Remover nome: \n" +
                "3 - Listar todos os nomes \n" +
                "0 - sair.");

        return menu;
    }
}
