package Dmetodoseestruturamodulardeprogramas.aula04.exercicioB;

import java.util.Scanner;

public class ExercicioB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Media media = new Media();

        System.out.print("Informe as 3 médias do aluno: \n-> ");
        double calcular = media.calcular(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());

        System.out.printf("A média do aluno é: %.2f%n", calcular);
    }
}
