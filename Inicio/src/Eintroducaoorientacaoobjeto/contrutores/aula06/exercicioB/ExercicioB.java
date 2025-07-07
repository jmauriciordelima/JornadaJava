package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioB;

import java.util.Scanner;

public class ExercicioB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome colaborador(a): ");
        String colaborador = entrada.nextLine();


        System.out.print("Para escolher um cargo, digite um dos valores a baixo." +
                "\n1 - RH" +
                "\n2 - ATENDENTE" +
                "\n3 - VENDEDOR" +
                "\n4 - SUPERVISOR" +
                "\n5 - ASG" +
                "\n6 - DIRETOR \n");
        int opcao = entrada.nextInt();
        Cargo cargo;
        switch (opcao) {
            case 1:
                cargo = Cargo.RH;
                break;
            case 2:
                cargo = Cargo.ATENDENTE;
                break;
            case 3:
                cargo = Cargo.VENDEDOR;
                break;
            case 4:
                cargo = Cargo.SUPERVISOR;
                break;
            case 5:
                cargo = Cargo.ASG;
                break;
            case 6:
                cargo = Cargo.DIRETOR;
                break;
            default:
                cargo = Cargo.NAO_DEFINIDO;
        }

        System.out.print("Informe o salario R$ ");
        double salario = entrada.nextDouble();

        Funcionario funcionario = new Funcionario(colaborador, salario, cargo);

        funcionario.exibirFuncionario();

        System.out.println("Informe o percentual do aumento do salário % 'ex.: 3 - para 0,03%' ");
        double aumento = entrada.nextDouble();

        funcionario.aumentarSalario(aumento);

        funcionario.exibirFuncionario();
    }
}
