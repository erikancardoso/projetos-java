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
            System.out.println(mostrar);
        }
        System.out.println("exibir a quantidade de cores");
        Iterator<ArcoIris> iterator = cores.iterator();
        int count = 0;
        while (iterator.hasNext()){
            ArcoIris proximoElementos = iterator.next();
            count++;
        }
        System.out.println(count+" cores");
    }
}



