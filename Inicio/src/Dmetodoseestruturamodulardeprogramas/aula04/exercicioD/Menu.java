package Dmetodoseestruturamodulardeprogramas.aula04.exercicioD;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<String> produtos = new ArrayList<>();

    public void menu() {

        String opcoes = ("Escola uma das opções a seguir: \n" +
                "1 - Adicionar nome: \n" +
                "2 - Remover nome: \n" +
                "3 - Listar todos os nomes \n" +
                "0 - sair.");

        System.out.println(opcoes);
    }

    public void adicionar(String item) {

        produtos.add(item);
        System.out.println(item + " adicionado com sucesso.");
    }

    public void remove(String item) {

        if (produtos.contains(item)) {
            produtos.remove(item);
            System.out.println(item + " - Removido.");
        } else {
            System.out.println("Produto não encontrado.");
        }

    }


    public void listar() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (String item : produtos) {

                System.out.println(item);

            }
        }
        System.out.println("\n-----------------------------\n");
    }
}