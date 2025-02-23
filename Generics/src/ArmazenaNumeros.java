public class ArmazenaNumeros implements Armazenar<Integer> {
    public int numero;

    @Override
    public void salvar(Integer item){
        this.numero = item;
    }

    @Override
    public Integer recuperar() {
        return this.numero;
    }


}
