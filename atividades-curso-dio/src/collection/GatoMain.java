package collection;

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
    }
}