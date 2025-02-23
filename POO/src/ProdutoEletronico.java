public class ProdutoEletronico {
    private String nome;
    private double preco;
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia) {
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + ", Preço: " + preco + ", Garantia: " + garantia);
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <=100){
            double valorDesconto = calcularDesconto(porcentagem);
            double precoFinal = this.preco - valorDesconto;
            this.preco = precoFinal;
            System.out.println("Desconto: " + valorDesconto + ", Preço com desconto: " + precoFinal);
        }else{
            System.out.println("Porcentagem de desconto inválida!");
        }
    }

    private double calcularDesconto(double porcentagem){
        return (this.preco * porcentagem) / 100;
    }
}
