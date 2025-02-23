public class Pessoa {
    private String nome; //Não consigo fazer atribuição direta, ex: p1.nome="Savio"
    private int idade;

    public void setNome(String nome) { //setter
        this.nome = nome;
    }

    public String getNome() { //getter
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
