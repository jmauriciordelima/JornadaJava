package Eintroducaoorientacaoobjeto.aula05.exercicioB;

import java.util.Scanner;

public class ExercicioB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.print("Informe o nome do aluno(a): ");
        aluno1.setNome(entrada.nextLine());

        System.out.print("Informe a 1ª nota: ");
        aluno1.setNota1(entrada.nextDouble());

        System.out.print("Informe a 2ª nota: ");
        aluno1.setNota2(entrada.nextDouble());

        aluno1.verificarAprovacao();

    }
}
