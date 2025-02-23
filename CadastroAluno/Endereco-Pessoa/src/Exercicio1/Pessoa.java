package Exercicio1;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
        endereco.exibeInformacao();

    }
}
