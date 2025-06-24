package Carraysecolecoes.aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioE {

    public static void main(String[] args) {

        List<String> produtos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        String entradaProduto;

        do {
            System.out.print("Insira o nome do produto, digite 'sair' para finalizar: ");
            entradaProduto = entrada.nextLine();

            if (!entradaProduto.equalsIgnoreCase("sair")) {
                produtos.add(entradaProduto);
            }

        } while (!entradaProduto.equalsIgnoreCase("sair"));

        for (String produto : produtos) {
            System.out.println(produto);
        }
    }
}
