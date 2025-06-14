package Atiposdedadosvariaveisoperadores.aula01;

public class ExercicioC {

    public static void main(String[] args) {

        double salarioBruto = 1660;
        double inss = 0.11;

        double descontoValorSobreSalario = salarioBruto * inss;
        double salarioLiquido = salarioBruto - descontoValorSobreSalario;

        System.out.println("Salário bruto: " + salarioBruto + "\n" +
                "Desconto INSS: " + (inss * 100) + "% \n" +
                "Valor a ser descontado: R$ " + descontoValorSobreSalario + "\n" +
                "Salário Líquido: R$ " + salarioLiquido);
    }
}
