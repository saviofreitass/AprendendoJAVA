package Exercicio2;

import Exercicio2.Veiculo;

public class Carro extends Veiculo {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

}
