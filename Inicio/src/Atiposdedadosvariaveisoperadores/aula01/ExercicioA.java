package Atiposdedadosvariaveisoperadores.aula01;

public class ExercicioA {

    public static void main(String[] args) {

        String nome = "José Maurício";
        int idade = 36;
        double altura = 1.90;

        String maiorDeIdade = idade >= 18 ? "Sim. Maior de idade." : "Não. Menor de idade.";

        System.out.println("Meu nome é: " + nome + "\n" +
                "Minha idade é: " + idade + "anos. \n" +
                "Minha altura é: " + altura + "m de altura. \n" +
                "Sou maior de idade? " + maiorDeIdade);
    }
}
