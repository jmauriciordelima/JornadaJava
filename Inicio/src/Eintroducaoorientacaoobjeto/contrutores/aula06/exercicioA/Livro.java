package Eintroducaoorientacaoobjeto.contrutores.aula06.exercicioA;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("\n" +
                "----------------------------" +
                "\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAno Publicação: " + this.anoPublicacao +
                "\n----------------------------\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
