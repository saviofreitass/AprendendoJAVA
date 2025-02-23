public class Main {
    public static void main(String[] args) {

       /* Carro carro1 = new Carro();

        carro1.marca ="Vw";
        carro1.modelo = "Fusca";
        carro1.ano = 1945;

        Carro carro2 = new Carro();

        carro2.marca ="Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 2010;

        carro1.ligarMotor();
        carro2.ligarMotor();

        carro2.aumentarVelocidade(20);
        carro2.aumentarVelocidade(30);*/

        /*Pessoa p1 = new Pessoa();

        p1.setNome("Savio");
        System.out.println("Nome: " + p1.getNome());

        p1.setIdade(22);
        System.out.println("Idade: " + p1.getIdade());*/

        /*ContaBancaria contaSavio = new ContaBancaria();

        contaSavio.setTitular("Savio");
        contaSavio.setSaldo(100);

        contaSavio.exibirInfo();*/

        /*Produto camisa = new Produto();

        camisa.setNome("Blusa de frio");
        System.out.println(camisa.getNome());
        camisa.setPreco(20);
        System.out.println(camisa.getPreco());
        camisa.aplicarDesconto(20);*/

        /*Livro livro1 = new Livro("Harry Potter", "J W Hokins", 29);
        livro1.exibirInfo();*/

        /*Celular celular1 = new Celular("Samsung", "S20FE", 100);
        celular1.exibirInfo();

        celular1.ligaDesliga();
        celular1.ligaDesliga();

        celular1.usar(20);*/

        /*Aluno aluno1 = new Aluno("Savio", 1836, 88);
        aluno1.exibeInfo();

        aluno1.setNome("Taynara");
        aluno1.exibeInfo();
        aluno1.setNotaFinal(20);
        aluno1.exibeInfo();*/

        /*ContaCorrente conta1 = new ContaCorrente();

        conta1.setTitular("Savio");
        conta1.setSaldo(200);
        conta1.setLimiteSaque(150);

        conta1.exibirInfo();

        conta1.depositar(200);

        conta1.sacar(100);*/

        /*ProdutoEletronico produto = new ProdutoEletronico("Carro de controle", 30, 3 );
        produto.exibirInfo();

        produto.aplicarDesconto(20);*/

        LivroBiblioteca livro = new LivroBiblioteca();
        livro.setTitulo("Auto da Compadecida");
        livro.setAutor("Eu mesmo");
        livro.exibeInfo();

        livro.devolver();

        livro.pegarEmprestado();

        livro.devolver();

    }
}