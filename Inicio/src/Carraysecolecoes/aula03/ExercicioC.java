package Carraysecolecoes.aula03;

import java.util.Scanner;

public class ExercicioC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Insira o valor na linha - [" + i + "] coluna - [" + j + "]");
                int num = entrada.nextInt();
                matriz[i][j] = num;
            }
        }

        System.out.println("Resultado da sua matriz " + matriz.length + " x " + matriz.length);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
