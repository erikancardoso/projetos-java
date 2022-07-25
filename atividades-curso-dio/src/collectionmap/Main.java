package collectionmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001b[7m Crie um dicionário e relacione os estados e suas populações;\u001b[m");
        Map<String, Double> population = new HashMap<>() {
            {
                put("PE", 9.61662);
                put("AL", 3.351543);
                put("CE", 9.187103);
                put("RN", 3.534265);
            }
        };
        System.out.println("\u001b[32;40m "+population+"\u001b[m");
        System.out.println("\u001b[7m Substitua a população do estado do RN por 3.534.165;\u001b[m");
        population.put("RN", 3.534165);
        System.out.println("\u001b[32;40m "+population+"\u001b[m");
        System.out.println("\u001b[7m Confira se o estado PB está no dicionário, caso não adicione: PB 4.039.277;\u001b[m");
        System.out.println("\u001b[39;5;214m \u001b[41;5;153m"+population.containsKey("PB")+"\u001b[m");
        population.put("PB", 4.039277);
        System.out.println("\u001b[32;40m "+population+"\u001b[m");
        System.out.println("\u001b[7m Exiba a população PE;\u001b[m");
        System.out.println("\u001b[32;40m "+population.get("PE")+"\u001b[m");
        System.out.println("\u001b[7m Exiba todos os estados e suas populações na ordem que foi informado;\u001b[m");
        Map<String, Double> insertion = new LinkedHashMap<>() {
            {
                put("PE", 9.61662);
                put("AL", 3.351543);
                put("CE", 9.187103);
                put("RN", 3.534265);
                put("PB", 4.039277);
            }
        };
        System.out.println("\u001b[32;40m "+insertion+"\u001b[m");
        System.out.println("\u001b[7m Exiba os estados e suas populações em ordem alfabética;\u001b[m");
        Map<String, Double> order = new TreeMap<>(insertion);
        System.out.println("\u001b[32;40m "+order+"\u001b[m");
        System.out.println("\u001b[7m Exiba os Estados:\u001b[m");
        Set<String> states = order.keySet();
        System.out.println("\u001b[32;40m "+states+"\u001b[m");
        System.out.println("\u001b[7m Exiba a quantidade de população:\u001b[m");
        Collection<Double> amount = order.values();
        System.out.println("\u001b[32;40m "+amount+"\u001b[m");
        System.out.println("\u001b[7m Exiba o estado com o menor população e sua quantidade;\u001b[m");
        Double menorPopulacao = Collections.min(order.values());
        //System.out.println(menorPopulacao);
        Set<Map.Entry<String, Double>> entries = order.entrySet();
        String menorPorEstado = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                menorPorEstado = entry.getKey();
            }
        }
        System.out.println("\u001b[32;40m "+menorPorEstado + " - " + menorPopulacao+"\u001b[m");
        System.out.println("\u001b[m \u001b[7m Exiba o estado com a maior população e sua quantidade;\u001b[m");
        Double maior = Collections.max(amount);
        String maiorEstado = "";
        for (Map.Entry<String, Double> ent : entries) { //ent iterando em entreies
            if (ent.getValue().equals(maior))
                maiorEstado = ent.getKey();
        }
        System.out.println("\u001b[32;40m "+maiorEstado + " - " + maior+"\u001b[m");
        System.out.println("\u001b[7m Exiba a soma da população desses estados;\u001b[m");
        Iterator<Double> iterator = order.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\u001b[32;40m "+soma+"\u001b[m");
        System.out.println("\u001b[7m Exiba a média da população deste dicionário de estados;\u001b[m");
        System.out.println("\u001b[32;40m "+soma/order.size()+"\u001b[m");
        System.out.println("\u001b[7m Remova os estados com a população menor que 4.000.000;\u001b[m");
        Iterator<Double> iterator1 = order.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(4.039277)){
                iterator1.remove();
            }
        }
        System.out.println("\u001b[32;40m "+order+"\u001b[m");
        //System.out.println("\u001b[7m Apague o dicionário de estados;\u001b[m");
        order.clear();
        System.out.println("\u001b[7m Confira se o dicionário esta vazio:\u001b[m");
        System.out.println("\u001b[39;5;214m \u001b[42;5;153m "+order.isEmpty()+"\u001b[m");

    }
}
