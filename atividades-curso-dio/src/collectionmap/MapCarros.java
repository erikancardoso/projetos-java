package collectionmap;

import java.io.IOException;
import java.util.*;

public class MapCarros {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> meusCarros = new LinkedHashMap<>(){
            {
                put("Uno", 16);
                put("Mobi", 14);
                put("Hb20", 15);
                put("Kwid", 16);
            }
        };
        System.out.println("\u001b[32;40mcrie um dicionário que relacione os modelos aos seus valores.\u001b[m \n"+meusCarros);
        meusCarros.put("Uno", 13);
        System.out.println("\u001b[32;40mSubstitua o consumo do Uno por 13:\u001b[m\n"+meusCarros);
        System.out.println("\u001b[32;40mExiba o consumo de Uno:\u001b[m \n"+meusCarros.get("Uno"));
        System.out.println("\u001b[32;40m Ordene por insersão:\u001b[m \n"+meusCarros);
        System.out.println("\u001b[32;40mExiba o 3° modelo adicionado:\u001b[m");
        Set<Map.Entry<String, Integer>> entries = meusCarros.entrySet(); // criar entry
        int cont = 0;
        for (Map.Entry<String, Integer> verCar: entries) { // acessar o dicionario
            cont++;
            if (cont == 3) {
                System.out.println(verCar);
            }
        }
        System.out.println("Confira se o modelo Tucson esta no dicionário, se não insira-o:");
        if(!meusCarros.containsKey("Tucson")) meusCarros.put("Tucson", 16);
        System.out.println(meusCarros);
        
    }
}
