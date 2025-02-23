import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        while(true){

            System.out.println("Digite 6 numeros de 1 a 60 para seu bilhete: ");

            int[] numerosEscolhidos = new int[6];

            //Usuario escolhe numeros
            for(int i = 0; i < numerosEscolhidos.length; i++){
                System.out.println("Digite um numero: ");
                numerosEscolhidos[i] = scanner.nextInt();
            }

            //crio o bilhete com os numeros escolhidos
            Bilhete bilhete = new Bilhete(numerosEscolhidos);

            bilhetes.add(bilhete);

            System.out.println("Deseja registrar outro bilhete?(s ou n)");

            String resposta = scanner.next();

            if(resposta.equals("n")){
                break;
            }
        }

        System.out.println("Realizando Sorteio...");

        for(Bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultadoSorteio();
        }

        scanner.close();
    }
}