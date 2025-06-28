package Dmetodoseestruturamodulardeprogramas.aula04.exercicioC;

public class Verificador {

    public void verifica(int numero) {

        if (numero == 0) {
            System.out.println("Finalizando...");
        } else if (numero % 2 != 0) {
            System.out.println("Impar");
        } else {
            System.out.println("Par");
        }
    }
}
