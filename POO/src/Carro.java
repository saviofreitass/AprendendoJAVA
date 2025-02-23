public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean motorLigado = false;
    double velocidade = 0;

    void ligarMotor() {
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando motor...");
        }else{
            System.out.println("Motor já está ligado!");
        }
    }

    void aumentarVelocidade(int vel) {
        if(!motorLigado){
            System.out.println("Necessário ligar o motor!");
        }else{
            velocidade += vel;
            System.out.println("Velocidade atual: " + velocidade);
        }
    }

}
