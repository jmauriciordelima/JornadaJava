package Dmetodoseestruturamodulardeprogramas.aula04.exercicioC;

import java.util.Scanner;

public class ExercicioC {

    public static void main(String[] args) {

        Verificador verificador = new Verificador();

        Scanner entrada = new Scanner(System.in);

        int numero = -1;

        do {
            System.out.println("Informe um valor e veja se é par ou impar: \n" +
                    "Para finalizar digite '00' ");
            numero = entrada.nextInt();
            verificador.verifica(numero);

        } while (numero != 0);
    }
}
