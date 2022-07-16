package collectionlist;

import java.util.*;

public class GatoMain {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){
            {
                add(new Gato("jon", "Preto", 18));
                add(new Gato("Simba", "Tigrado", 6));
                add(new Gato("Jon", "Amarelo", 12));
            }
        };
        System.out.println("imprimir pela ordem de inserção");
        System.out.println(meusGatos); // basta colocar o ToString na classe principal
        System.out.println("imprimir ordem aleatoria");
        Collections.shuffle(meusGatos); // na list não existe, mas em Colletions tem a shurffle
        System.out.println(meusGatos);

        System.out.println("imprimir a ordem natural por nome");//usa-se implementação Comparable
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("imprimir a ordem natural por idade");//usa-se Collections
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos); // usando Comparator e Collections

        //outra forma de exibição usando sort da propria list porem deve implementar o comparator
        meusGatos.sort(new ComparatorIdade());
        System.out.println(""+meusGatos);

        System.out.println("Imprimir a ordem natural por cor");
        meusGatos.sort( new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("imprimir pela sequencia nome/cor/idade");
        meusGatos.sort( new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}