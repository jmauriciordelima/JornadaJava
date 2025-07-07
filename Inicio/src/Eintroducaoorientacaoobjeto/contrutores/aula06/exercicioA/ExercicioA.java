package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioA;

import java.util.Scanner;

public class ExercicioA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o Título do Livro: ");
        String titulo = entrada.nextLine();

        System.out.print("Informe o autor: " );
        String autor = entrada.nextLine();

        System.out.print("Informe o ano de publicação: ");
        int anoPublicacao = entrada.nextInt();

        Livro livro = new Livro(titulo, autor, anoPublicacao);

        livro.exibirDetalhes();

    }
}
