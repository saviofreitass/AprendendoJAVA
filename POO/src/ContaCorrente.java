public class ContaCorrente {
    private String titular;
    private double saldo;
    private double limiteSaque;

    public void setTitular(String titular) {
        if (titular != null || !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimiteSaque(double limiteSaque) {
        if (limiteSaque >= 0 && limiteSaque <= this.saldo){
            this.limiteSaque = limiteSaque;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void exibirInfo(){
        System.out.println("Titular: " + titular + ", Saldo: " + saldo + ", Limite: " + limiteSaque);
    }

    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depositado! Saldo atual: " + saldo);
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if(valor <= this.saldo && valor <= this.limiteSaque){
            this.saldo -= valor;
            System.out.println("Saque concluido! Saldo atual: " + saldo);
        }else{
            System.out.println("Valor inválido!");
        }
    }
}
