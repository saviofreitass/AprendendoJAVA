public class ArmazenarTextos implements Armazenar<String>{
    public String texto;

    @Override
    public void salvar(String item) {
        texto = item;
    }

    @Override
    public String recuperar() {
        return texto;
    }
}
