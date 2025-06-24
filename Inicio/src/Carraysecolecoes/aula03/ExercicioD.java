package Carraysecolecoes.aula03;

import java.util.Scanner;

public class ExercicioD {

    public static void main(String[] args) {

        double[] notas = new double[5];

        double somaNotas = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota: ");
            notas[i] = entrada.nextDouble();

        }

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        if (somaNotas >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.printf("Nota final: %.2f ", media);

    }
}
