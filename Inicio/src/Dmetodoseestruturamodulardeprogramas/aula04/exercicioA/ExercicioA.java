package Dmetodoseestruturamodulardeprogramas.aula04.exercicioA;

import java.util.Scanner;

public class ExercicioA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Saudacao saudacao = new Saudacao();

        String msg = "";

        System.out.print("Informe seu nome: " );
        msg = entrada.nextLine();

        saudacao.mensagem(msg);


    }
}
