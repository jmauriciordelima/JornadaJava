package Dmetodoseestruturamodulardeprogramas.aula04.exercicioD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioD {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Menu menu = new Menu();

        int opcao = -1;

        do {

            menu.menu();
            System.out.println("\n-----------------------------\n");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    entrada.nextLine();
                    System.out.print("Adicione um nome: ");
                    menu.adicionar(entrada.nextLine());
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Informe o nome a ser removido: ");
                    menu.remove(entrada.nextLine());
                    break;
                case 3:
                    menu.listar();
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

    }
}
