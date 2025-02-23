package Exercicio4;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios {

    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioMeioPeriodo(String nome, double salarioHora, int horasTrabalhadas) {
        super(nome);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioHora * horasTrabalhadas;
    }

    @Override
    public void adicionarBeneficio(String beneficio){
        System.out.println("Beneficio meio periodo: " + beneficio);
    }
}
