public class Caixa<T> {
    private T conteudo;

    public void adicionar(T conteudo){
        this.conteudo = conteudo;
    }

    public T mostrar(){
        return this.conteudo;
    }
}
