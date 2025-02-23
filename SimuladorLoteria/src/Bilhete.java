import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    public void realizarSorteio() {
        Random random = new Random();

        resultadoSorteio = new int[6];

        for(int i = 0; i < 6; i++) {
            resultadoSorteio[i] = random.nextInt(60)+1;
        }

        Arrays.sort(resultadoSorteio);
    }

    public int contarAcertos(){
        int acertos = 0;

        for(int numeroEscolhido: numerosEscolhidos) {
            for(int numeroSorteado: resultadoSorteio) {
                if(numeroEscolhido == numeroSorteado) {
                    acertos++;
                }
            }
        }

        return acertos;
    }

    public void exibirResultadoSorteio() {
        System.out.println("Números Escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números Sorteados: " + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();
        System.out.println("Acertos: " + acertos);
        System.out.println();
    }
}
