package collectionmap;

import java.io.IOException;
import java.util.*;

public class MapCarros {
    public static void main(String[] args) throws IOException {
        //crie um dicionário com modelos aos seus valores
        Map<String, Integer> meusCarros = new LinkedHashMap<>(){
            {
                put("Uno", 16);
                put("Mobi", 14);
                put("Hb20", 15);
                put("Kwid", 16);
            }
        };
        System.out.println("\u001b[32;40mcrie um dicionário com modelos aos seus valores.\u001b[m \n \u001b[7;42m "+meusCarros+"\u001b[m");
        //Substitua o consumo do Uno por 13
        meusCarros.put("Uno", 13);
        System.out.println("\u001b[32;40mSubstitua o consumo do Uno por 13:\u001b[m\n \u001b[7;42m "+meusCarros+"\u001b[m");
        System.out.println("\u001b[32;40mExiba o consumo de Uno:\u001b[m \n \u001b[7;42m "+meusCarros.get("Uno")+"\u001b[m");
        System.out.println("\u001b[32;40m Ordene por insersão:\u001b[m \n \u001b[7;42m "+meusCarros+"\u001b[m");
        System.out.println("\u001b[32;40mExiba o 3° modelo adicionado:\u001b[m");
        Set<Map.Entry<String, Integer>> entries = meusCarros.entrySet(); // criar entry
        int cont = 0;
        for (Map.Entry<String, Integer> verCar: entries) { // acessar o dicionario
            cont++;
            if (cont == 3) {
                System.out.println("\u001b[7;42m "+verCar+"\u001b[m");
            }
        }
        System.out.println("\u001b[32;40mConfira se o modelo Tucson esta no dicionário, se não insira-o:\u001b[m");
        if(!meusCarros.containsKey("Tucson")) meusCarros.put("Tucson", 16);
        System.out.println("\u001b[7;42m "+meusCarros+"\u001b[m ");
        System.out.println("\u001b[32;40mExibir o modelo que tem  o menor consumo:\u001b[m ");
        Integer menor = Collections.min(meusCarros.values());
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menor)) {
                System.out.println("\u001b[32;40m Consumo de: \u001b[m \u001b[7;42m" +
                        menor + "\u001b[m  \u001b[32;40m Modelo:\u001b[m \u001b[7;42m " + entry.getKey()+"\u001b[m ");
            }
        }
        System.out.println("\u001b[32;40mExibir o modelo mais caro:\u001b[m");
        Integer maior = Collections.max(meusCarros.values());
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maior)) {
                System.out.println("\u001b[32;40m Consumo de: \u001b[m \u001b[7;42m " +
                        maior + "\u001b[m  \u001b[32;40m Modelo:\u001b[m \u001b[7;42m " + entry.getKey()+"\u001b[m ");
            }
        }
        System.out.println("\u001b[32;40m Exiba a soma dos consumos \u001b[m");
        Iterator<Integer> iterator = meusCarros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\u001b[7;42m"+soma+"\u001b[m");
        System.out.println("\u001b[32;40mExiba a média so consumo:\u001b[m \u001b[7;42m "+ soma/meusCarros.size()+"\u001b[m");
        System.out.println("\u001b[32;40mRemova os modelos com o consumo igual a 13 km/l \u001b[m"+meusCarros.values().remove(13));
        System.out.println("\u001b[7;42m"+meusCarros+"\u001b[m");
        System.out.println("\u001b[32;40mExibir Modelos por ordem Natural:\u001b[m");
        Map<String, Integer> ordemNatural = new TreeMap<>(meusCarros);
        System.out.println("\u001b[7;42m"+ordemNatural.keySet()+"\u001b[m");
        //apagar o dicionario de carros
        meusCarros.clear();
        System.out.println("\u001b[32;40m confira se esta vazio:\u001b[m  \u001b[7;42m"+meusCarros.isEmpty()+"\u001b[m");
    }
}
