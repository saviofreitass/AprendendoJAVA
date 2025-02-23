public class Livro {
    private String titulo;
    private String autor;
    private double valor;

    public Livro(String titulo, String autor, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + this.titulo + ", Autor: " + this.autor + ", Valor: " + this.valor);
    }
}
