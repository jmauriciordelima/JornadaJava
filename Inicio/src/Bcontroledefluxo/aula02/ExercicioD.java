package Bcontroledefluxo.aula02;

public class ExercicioD {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma = i + soma;
        }

        System.out.println("Soma total: " + soma);
    }
}
