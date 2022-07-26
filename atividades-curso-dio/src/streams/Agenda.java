package streams;

import java.util.*;
import java.util.function.Function;

public class Agenda {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
                put(1, new Contato("Maria", 84526));
                put(4, new Contato("Ana", 58726));
                put(3, new Contato("Joana", 56985));
            }};
        /*
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        */
        System.out.println("refatorando codigo");

        /*System.out.println("--\tOrdem número telefone Usando implementação \t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }*/

        /*System.out.println("--\tOrdem número telefone Usando Classe Anonima\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(),o2.getValue().getNumero());
            }
        }); //Criando classe anonima para substituir a Class ComparatorOrdemNumeroca por ser usado apenas 1 vez */

        /*System.out.println("--\tOrdem número telefone com metodo estatico do comparator comparing e function\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> ContatoEntry) {
                return ContatoEntry.getValue().getNumero();
            }
        }));*/
        System.out.println("--\tOrdem número telefone com Lambda\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(ContatoEntry -> ContatoEntry.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato com Lambda\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(NomeEntry -> NomeEntry.getValue().getNome()));

        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}
*/

/*class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}*/

