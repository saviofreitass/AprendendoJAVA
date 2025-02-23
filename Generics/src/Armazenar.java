public interface Armazenar<T> {
    void salvar(T item);
    T recuperar();
}
