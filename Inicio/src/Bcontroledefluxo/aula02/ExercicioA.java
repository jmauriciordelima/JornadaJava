package Bcontroledefluxo.aula02;

import java.util.Scanner;

public class ExercicioA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(faseDeIdade(idade));
    }

    static String faseDeIdade(int idade) {

        String mensagem;

        if (idade <= 12) {
            mensagem = "Criança";
        } else if (idade <= 17) {
            mensagem = "Adolescente";
        } else if (idade <= 59) {
            mensagem = "Adulto";
        } else {
            mensagem = "Idoso";
        }
        return mensagem;
    }
}
