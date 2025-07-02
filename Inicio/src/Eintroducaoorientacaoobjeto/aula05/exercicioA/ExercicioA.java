package Eintroducaoorientacaoobjeto.aula05.exercicioA;

import java.util.Scanner;

public class ExercicioA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Carro c1 = new Carro();

        System.out.println("Infome a marca do veículo: ");
        c1.setMarca(entrada.nextLine());
        System.out.print("Informe o modelo do veículo: ");
        c1.setModelo(entrada.nextLine());
        System.out.print("Informe o ano do veículo: ");
        c1.setAno(entrada.nextInt());

        c1.exibirInformacoes();



    }
}
