public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibeInfo(){
        System.out.println("Titulo: " + this.titulo + ", Autor: " + this.autor);
    }

    public void pegarEmprestado(){
        if(disponivel){
            System.out.println("Você pegou o livro emprestado!");
            this.disponivel = false;
        }else{
            System.out.println("Livro não está disponível!");
        }
    }

    public void devolver(){
        if(!disponivel){
            System.out.println("Você devolveu o livro!");
            this.disponivel = true;
        }else{
            System.out.println("O livro já estava na biblioteca!");
        }
    }
}
