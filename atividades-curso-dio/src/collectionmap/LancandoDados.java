package collectionmap;

import java.util.*;

public class LancandoDados {
    public static void main(String[] args) {
        //faça um programa que simula um lancamento de dados
        List<Integer> data = new ArrayList<>();
        //lance o dado 100 veses e armazene
        Random generator = new Random();
        //inserindo dados do Randon na lista
        for (int i = 0; i < 100; i++){
            int number = generator.nextInt(100);
            data.add(number);
        }
        // mostre quantas vezes cada valor foi inserido
        
        Iterator<Integer> cont = data.iterator();
        while (cont.hasNext()){
            int valor = cont.next();
            if (valor == cont.next()){

            }
        }


    }
}
