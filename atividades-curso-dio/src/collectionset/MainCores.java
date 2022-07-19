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
        System.out.println("exibir cores com letra v: ");
        Iterator<ArcoIris> iterator1 = ordem.iterator();
        int count1 = 0;
        while (iterator1.hasNext()){
            ArcoIris letra = iterator1.next();
            String primeiraLetra = letra.getCor().substring(0,1);
            String V= "V";
            boolean sim = true;
            if (primeiraLetra.equals(V)) {
                System.out.println(letra.getCor());
            }
            count1++;
        }
        
    }
}



