package Aestruturascondicionais.aula01;

public class ExercicioF {

    public static void main(String[] args) {

        double peso = 102.3;
        double altura = 1.9;

        double imc = peso / (altura * altura);

        System.out.println("Classificação: " + classificacaoIMC(imc) + " - IMC " + imc);
    }

    static String classificacaoIMC(double imc) {

        String classificacao;

        if (imc < 16) {
            classificacao = "Magreza grave";
        } else if (imc < 17) {
            classificacao = "Magreza moderada";
        } else if (imc < 18.5) {
            classificacao = "Magreza leve";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III";
        }
        return classificacao;
    }
}
