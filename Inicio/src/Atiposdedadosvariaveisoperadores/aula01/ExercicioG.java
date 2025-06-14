package Atiposdedadosvariaveisoperadores.aula01;

public class ExercicioG {

    public static void main(String[] args) {

        boolean temCarteira = true;
        boolean temIdadeMinima = true;
        boolean temBoaVisao = true;
        boolean podeDirigir = false;

        String situacao;

        if (temCarteira && temIdadeMinima && temBoaVisao) {
            podeDirigir = true;
        }

        if (podeDirigir) {
            situacao = "Pode dirigir";
        } else {
            situacao = "Não pode dirigir";
        }

        System.out.println(situacao);

    }
}