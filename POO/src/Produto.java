public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        if(nome != null && nome.length() > 3) {
            this.nome = nome;
        }else{
            System.out.println("Nome não atende aos requesitos!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    public String getPreco(){
        return String.format("%.2f", preco);
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 100 ){
            double desconto = calcularDesconto(porcentagem);
            double valorFinal = this.preco - desconto;

            this.setPreco(valorFinal);
             System.out.println("Desconto: " + porcentagem + "%");
             System.out.println("Valor: " + valorFinal);
        }
    }

    private double calcularDesconto(double porcentagem){
        return (this.preco * porcentagem) / 100;
    }
}
