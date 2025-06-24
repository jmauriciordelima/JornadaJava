package Carraysecolecoes.aula03;

import java.util.Random;

public class ExercicioB {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = numeroAleatorio();
        }

        System.out.println("Números pares gerados: ");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
    }

    static Random random = new Random();

    static int numeroAleatorio() {
        int numeroAleatorio = random.nextInt(100) + 1;
        return numeroAleatorio;
    }
}
