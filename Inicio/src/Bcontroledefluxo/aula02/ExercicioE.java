package Bcontroledefluxo.aula02;

import java.util.Scanner;

public class ExercicioE {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senha = "1234";

        String aprovarSenha = "";

        do {
            System.out.print("Digite sua senha: ");
            aprovarSenha = entrada.next();

            if (!aprovarSenha.equals(senha)) {
                System.out.println("Acesso negado.");
            } else {
                System.out.println("Acesso permitido.");
            }

        } while (!aprovarSenha.equals(senha));
    }
}
