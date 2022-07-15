package collectionset;

import java.util.*;

public class Desafio5 {
    public static void main(String[] args) {
        System.out.println("dada uma lista de 7 notas crie e inicialise usando Coleções Set");
        Set<Double> notas = new LinkedHashSet<>(Arrays.asList(10d,8d,5d,7d));
        System.out.println("Imprima o conteudo da lista:" + notas);
        System.out.println("verifique se o elemento 10 contem nesta lista: "+ notas.contains(10d));
        System.out.println("Mostrar por ordem de inserção usando LinkedHashSet: ");
        for ( Double mostrarOrdem: notas) {
            System.out.println(mostrarOrdem);
        }
        System.out.println("A menor nota: "+ Collections.min(notas));
        System.out.println("A maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        int soma = 0;
        while (iterator.hasNext()){
            Double proximoElementos = iterator.next();
            soma += proximoElementos;
        }
        System.out.println("A soma das notas: "+soma);
        System.out.println("A média das notas: "+soma/ notas.size());

        notas.remove(5d);
        System.out.println("removendo nota 5: "+ notas);

        //remover notas menores que 8 usando iterator
        Iterator<Double> iteracao = notas.iterator();
        while (iteracao.hasNext()){
            Double variavel = iteracao.next();
            if (variavel < 8){
                notas.remove(variavel);
            }
        }
        System.out.println("removendo notas menores que 8: "+notas);

        TreeSet<Double> ordem = new TreeSet<>(notas);
        System.out.println("Ordenando por ordem natural com TreeSet:"+ordem);
        // apagar toda a lista
        notas.clear();
        System.out.println("Conferir se a lista esta vazia: "+ notas.isEmpty());

    }
}

