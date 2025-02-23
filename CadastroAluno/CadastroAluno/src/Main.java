import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int numeroDeAlunos = scanner.nextInt();

        //criacao de array de alunos
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Cadastrando aluno " + (i+1) + " : ");

            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.println("Digite a matricula do aluno: ");
            String matricula = scanner.next();

            System.out.println("Digite a quantidade de notas do aluno: ");
            int quantidade = scanner.nextInt();

            Aluno aluno = new Aluno(nome, matricula, quantidade);

            aluno.adicionaNota(scanner);

            alunos[i] = aluno;
        }

        System.out.println("Resultado dos alunos: ");

        for (Aluno aluno : alunos) {
            aluno.exibirResultado();
            System.out.println();
        }

        scanner.close();
    }
}