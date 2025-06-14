package Bcontroledefluxo.aula02;

import java.util.Scanner;

public class ExercicioB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número entre 1 e 7 e descubra qual o dia da semana: ");
        int entradaData = entrada.nextInt();

        String diaDaSemana = "";

        switch (entradaData) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                System.out.println("Dia inválido.");

        }
        System.out.println(diaDaSemana);
    }

//    switch (entradaData) {
//        case 1 -> System.out.println("Domingo");
//        case 2 -> System.out.println("Segunda");
//        case 3 -> System.out.println("Terça");
//        case 4 -> System.out.println("Quarta");
//        case 5 -> System.out.println("Quinta");
//        case 6 -> System.out.println("Sexta");
//        case 7 -> System.out.println("Sábado");
//        default -> System.out.println("Dia inválido.");
//    }
// - Versão aprimorada a partir do java 14.

}
