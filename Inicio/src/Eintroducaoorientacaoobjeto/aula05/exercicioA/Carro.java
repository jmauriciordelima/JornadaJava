package Eintroducaoorientacaoobjeto.aula05.exercicioA;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public void exibirInformacoes() {

        System.out.println("\nInformações do veículo cadastrado\n" +
                "----------------------------------\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Ano: " + getAno());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
