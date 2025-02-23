public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Nome inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        if(matricula >= 0) {
            this.matricula = matricula;
        }else{
            System.out.println("Matrícula inválida!");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNotaFinal(double notaFinal) {
        if(notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        }else{
            System.out.println("Nota inválida!");
        }
    }

    public void exibeInfo(){
        System.out.println("Nome: " + nome + ", Maatricula: " + matricula + ", Nota Final: " + notaFinal);
    }
}
