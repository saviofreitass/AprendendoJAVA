public class Criatura<T extends Animal & Nadar & Voador>{
    private T criatura;

    public Criatura(T criatura){
        this.criatura = criatura;
    }

    public void habilidades(){
        criatura.mover();
        criatura.nadar();
        criatura.voar();
    }

}
