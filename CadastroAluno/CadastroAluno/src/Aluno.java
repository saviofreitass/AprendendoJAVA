import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, int numeroDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];
    }

     public void adicionaNota(Scanner scanner) {

        System.out.print("Digite as notas para o aluno " + nome + ": ");

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public double calculaMedia() {
        double media = 0;
        for(double nota : notas) {
            media += nota;
        }
        return media / notas.length;
    }

    public void exibirResultado(){
        double media = calculaMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media final: " + media);

        if(media>= 6.0){
            System.out.println("Aluno aprovado com sucesso!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }

}

