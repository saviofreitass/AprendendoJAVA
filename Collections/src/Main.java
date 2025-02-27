import java.util.*;

public class Main {
    public static void main(String[] args) {

        //uso de ArrayList
        List<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Jose");
        listaDeNomes.add("Maria");
        listaDeNomes.add("Savio");

        System.out.println(listaDeNomes.get(0));
        System.out.println(listaDeNomes.contains("Savio"));
        System.out.println(listaDeNomes.contains("Pedro"));

        listaDeNomes.set(0, "Pedro");

        listaDeNomes.remove(2);

        //uso de LinkedList
        List<Integer> listaNumeros  =new LinkedList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);

        System.out.println(listaNumeros.get(0));

        //uso de Set
        Set<String> nomes =new HashSet<>();

        nomes.add("Savio");
        nomes.add("Jose");
        nomes.add("Maria");
        nomes.add("Savio");

        System.out.println(nomes);

        Set<String> nomes2 = new LinkedHashSet<>();

        nomes2.add("Savio");
        nomes2.add("Jose");
        nomes2.add("Maria");

        System.out.println(nomes2);

        Set<Integer> numeros = new TreeSet<>(); //ordena

        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);




    }
}