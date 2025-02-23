public class ContaBancaria {
    private String titular;
    private int saldo;

    public void setTitular(String titular) {
        if(titular!=null && !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("Titular inválido");
        }
    }

    public void setSaldo(int saldo){
        if(saldo>=0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo precisa ser positivo!");
        }
    }

    public String getTitular(){
        return titular;
    }

    public String getSaldo(){
        return "R$" + saldo;
    }

    public void exibirInfo(){
        System.out.println("Titular: " + this.getTitular() + " Saldo: " + this.getSaldo());
    }
}
