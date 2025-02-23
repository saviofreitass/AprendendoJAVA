public class Pato extends Animal implements Voador, Nadar{
    @Override
    public void voar() {
        System.out.println("Pato voando");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando");
    }

}
