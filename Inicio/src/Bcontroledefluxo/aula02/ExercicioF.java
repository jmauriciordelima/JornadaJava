package Bcontroledefluxo.aula02;

import java.util.Scanner;

public class ExercicioF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Boolean fim = false;

        int numero;

        do {
            System.out.print("Informe qual tabuada deseja verificar." +
                    "\nQuando quiser finalizar é só digitar 0." +
                    "\n-> ");
            numero = entrada.nextInt();

            fim = numero == 0;

            if (fim) {
                System.out.println("Finalizando...");
                break;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }
            System.out.println("\n----------------------\n");

        } while (!fim);
    }
}
