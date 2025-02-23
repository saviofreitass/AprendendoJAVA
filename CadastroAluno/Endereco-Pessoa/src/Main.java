import Exercicio1.Endereco;
import Exercicio1.Pessoa;
import Exercicio2.Carro;
import Exercicio2.Moto;
import Exercicio2.Veiculo;
import Exercicio3.Animal;
import Exercicio3.Cachorro;
import Exercicio4.Funcionario;
import Exercicio4.FuncionarioMeioPeriodo;
import Exercicio4.FuncionarioTempoIntegral;
import Exercicio5.Aviao;
import Exercicio5.Barco;
import Exercicio5.Hidroavio;
import Exercicio5.Navegavel;
import Exercicio5.Pilotavel;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Vigario Varela", 1340, "VRB");
        Pessoa pessoa1 = new Pessoa("Savio", 22, endereco1);

        pessoa1.exibirInfo();

        System.out.println();

        Veiculo carro = new Carro("Vw", "Gol");
        Veiculo moto = new Moto("Honda", "Cg");
        Veiculo veiculo = new Veiculo();

        carro.acelerar();
        moto.acelerar();
        veiculo.acelerar();

        System.out.println();

        Cachorro cachorro = new Cachorro("Shizune", "Latido", "Pastor");

        cachorro.exibirDetalhes();

        System.out.println();

        FuncionarioTempoIntegral funcionarioIntegral = new FuncionarioTempoIntegral("Savio", 50, 12);
        FuncionarioMeioPeriodo funcionarioMeio = new FuncionarioMeioPeriodo("Pedro", 20, 6);

        System.out.println(funcionarioIntegral.calcularSalario());
        funcionarioIntegral.adicionarBeneficio("Hora extra");

        System.out.println(funcionarioMeio.calcularSalario());
        funcionarioMeio.adicionarBeneficio("Periculosidade");

        System.out.println();

        Pilotavel meuHidroAviao = new Hidroavio();
        Navegavel meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuHidroAviao.pilotar();
        meuBarco.navegar();
        meuAviao.pilotar();

        operarVeiculo(meuHidroAviao);
        operarVeiculo(meuBarco);
        operarVeiculo(meuAviao);

        boolean tre = true;
        int po = "25";


    }

    public static void operarVeiculo(Object veiculo){
        if(veiculo instanceof Pilotavel){
            System.out.println("Este veiculo é pilotavel");
        }

        if(veiculo instanceof Navegavel){
            System.out.println("Este veiculo é navegavel");
        }
    }
}