package Exercicio4;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios{

    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioTempoIntegral(String nome, double salarioHora, int horasTrabalhadas) {
        super(nome);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario(){
        return salarioHora * horasTrabalhadas + 200;
    }

    @Override
    public void adicionarBeneficio(String beneficio) {
        System.out.println("Beneficio integral: " + beneficio);
    }
}
