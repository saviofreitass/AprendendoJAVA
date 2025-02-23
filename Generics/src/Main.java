import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Classes genericas
        Caixa<Integer> caixa1 = new Caixa<>();

        caixa1.adicionar(20);
        System.out.println(caixa1.mostrar());

        //metodos genericos
        System.out.println(obterMaior(1,2));
        System.out.println(obterMaior("Savio", "Sav"));

        Integer[] num = {1,2,3};
        String[] nomes ={"Savio", "Taynara", "Pedro"};

        imprimirArray(num);
        System.out.println();
        imprimirArray(nomes);
        System.out.println();

        //Bounded Types
        Comparador<Integer> comp1 = new Comparador<>();
        System.out.println(comp1.obterMaior(1, 2));
            //erro de compilacao
            //Comparador<String> comp2 = new Comparador<>();

        //WildCards

        //aceita qualquer tipo
        List<Integer> lista1 = List.of(1,2,3);
        List<String> lista2 = List.of("Taynara", "Savio");

        System.out.println();
        imprimirLista(lista1);
        System.out.println();
        imprimirLista(lista2);

        List<Number> lista3 = List.of(1,2,3);

        System.out.println();
        somarNumeros(lista3);

        List<Integer> lista4 = new ArrayList<>();

        adicionarLista(lista4);

        for(Integer elemento : lista4) {
            System.out.print(elemento + ", ");
        }

        System.out.println();

        //Generics com Collections
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);

        for(Number elemento : listaInteiros) {
            System.out.println(elemento + ", ");
        }

        System.out.println();

        Set<String> conjuntoPalavras = new HashSet<>();
        conjuntoPalavras.add("Taynara");
        conjuntoPalavras.add("Savio");
        conjuntoPalavras.add("Savio"); //nao adiciona igual

        for(String palavra : conjuntoPalavras) {
            System.out.print(palavra + ", ");
        }

        System.out.println();

        Map<String, Integer> mapaIdades = new HashMap<>();
        mapaIdades.put("Taynara", 20);
        mapaIdades.put("Savio", 22);

        for(Map.Entry<String, Integer> elemento : mapaIdades.entrySet()) {
            System.out.println(elemento.getKey() + " " + elemento.getValue());
        }

        System.out.println();

        //Generics com interfaces
        Armazenar<Integer> aNumeros = new ArmazenaNumeros();
        Armazenar<String> aTexto = new ArmazenarTextos();

        aNumeros.salvar(10);
        System.out.println(aNumeros.recuperar());

        aTexto.salvar("Taynara");
        System.out.println(aTexto.recuperar());

        //Restrição multipla com generics
        Pato pato = new Pato();

        Criatura<Pato> criatura = new Criatura<>(pato);

        criatura.habilidades();

    }
    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2))> 0 ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array) {
        for(T elemento : array) {
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista){
        for(Object elemento : lista) {
            System.out.print(elemento + ", ");
        }
    }

    public static void somarNumeros(List<? extends Number> lista){
        double soma = 0;
        for(Number elemento : lista) {
            soma += elemento.doubleValue();
        }
        System.out.println(soma);
    }

    public static void adicionarLista(List<? super Integer> lista){
        for(int i=1; i<=5; i++){
            lista.add(i);
        }
    }
}