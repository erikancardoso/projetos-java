package collectionset;

import java.util.*;

public class MainCores {

    public static void main(String[] args) {
        Set<ArcoIris> cores = new HashSet<ArcoIris>(){
            {
                add(new ArcoIris("Violeta"));
                add(new ArcoIris("Anil"));
                add(new ArcoIris("Azul"));
                add(new ArcoIris("Verde"));
                add(new ArcoIris("Amarelo"));
                add(new ArcoIris("Laranja"));
                add(new ArcoIris("Vermelho"));
                add(new ArcoIris("Rosa"));
            }
        };
        System.out.println("Exibir as cores: ");
        for (ArcoIris mostrar: cores) {
            System.out.println(mostrar.getCor());
        }
        System.out.println("exibir a quantidade de cores");
        Iterator<ArcoIris> iterator = cores.iterator();
        int count = 0;
        while (iterator.hasNext()){
            ArcoIris proximoElementos = iterator.next();
            count++;
        }
        System.out.println(count+" cores");

        System.out.println("exibir cores por ordem natural");
        Set<ArcoIris> ordem = new TreeSet<>(cores);

        for (ArcoIris natural: ordem) {
            System.out.println(natural.getCor());
        }

        System.out.println("exibir cores com letra em ordem decrescente: ");
        Set<ArcoIris> decrescente = new TreeSet<>(ordem).descendingSet();
        for (ArcoIris decre: decrescente) {
            System.out.print(decre.getCor()+ " - ");
        }

        System.out.println("\nexibir cores com letra v: ");
        Iterator<ArcoIris> iterator1 = ordem.iterator();
        int count1 = 0;
        while (iterator1.hasNext()){
            ArcoIris letra = iterator1.next();
            String primeiraLetra = letra.getCor().substring(0,1);
            String V= "V";
            boolean sim = true;
            if (primeiraLetra.equals(V)) {
                System.out.print(letra.getCor()+" - ");
            }
            count1++;
        }

        System.out.println("\nRemover cores com letra v: ");
        Iterator<ArcoIris> iterator2 = ordem.iterator();
        int count2 = 0;
        while (iterator2.hasNext()){
            ArcoIris verLetra = iterator2.next();
            String primeiraLetraRemove = verLetra.getCor().substring(0,1);
            String V= "V";
            if (!(primeiraLetraRemove.equals(V))) {
                System.out.print(verLetra.getCor()+ " - ");
            }
            count2++;
        }
        System.out.println("\nlimpe o conjunto: ");
        cores.clear();
        System.out.println(cores);
        System.out.println("Conferir se o conjunto esta vazio: "+cores.isEmpty());

    }
}



