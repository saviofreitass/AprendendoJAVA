package Exercicio2;

import Exercicio2.Veiculo;

public class Moto extends Veiculo {
    private String marca;
    private String modelo;

    public Moto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
}
