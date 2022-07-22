package collectionmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações;");
        Map<String, Double> population = new HashMap<>() {
            {
                put("PE", 9.61662);
                put("AL", 3.351543);
                put("CE", 9.187103);
                put("RN", 3.534265);
            }
        };
        System.out.println(population);
        System.out.println("\nSubstitua a população do estado do RN por 3.534.165;");
        population.put("RN", 3.534165);
        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB 4.039.277;");
        System.out.println(population.containsKey("PB"));
        population.put("PB", 4.039277);
        System.out.println("\nExiba a população PE;");
        System.out.println(population.get("PE"));
        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado;");
        Map<String, Double> insertion = new LinkedHashMap<>() {
            {
                put("PE", 9.61662);
                put("AL", 3.351543);
                put("CE", 9.187103);
                put("RN", 3.534265);
                put("PB", 4.039277);
            }
        };
        System.out.println(insertion);
        System.out.println("\u001b[1m Exiba os estados e suas populações em ordem alfabética;\u001b[m");
        Map<String, Double> order = new TreeMap<>(insertion);
        System.out.println(order);
        System.out.println("\u001b[2m Exiba os Estados:\u001b[m ");
        Set<String> states = order.keySet();
        System.out.println(states);
        System.out.println("\u001b[3m Exiba a quantidade de população:\u001b[m ");
        Collection<Double> amount = order.values();
        System.out.println(amount);
        System.out.println("\u001b[4m Exiba o estado com o menor população e sua quantidade;\u001b[m");
        Double menorPopulacao = Collections.min(order.values());
        //System.out.println(menorPopulacao);
        Set<Map.Entry<String, Double>> entries = order.entrySet();
        String menorPorEstado = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                menorPorEstado = entry.getKey();
            }
        }
        System.out.println(menorPorEstado + " - " + menorPopulacao);
        System.out.println("\nExiba o estado com a maior população e sua quantidade ;");
        Double maior = Collections.max(amount);
        String maiorEstado = "";
        for (Map.Entry<String, Double> ent : entries) { //ent iterando em entreies
            if (ent.getValue().equals(maior))
                maiorEstado = ent.getKey();
        }
        System.out.println(maiorEstado + " - " + maior);
        System.out.println("\u001b[7mExiba a soma da população desses estados;\u001b[m");
        Iterator<Double> iterator = order.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("\u001b[9m Exiba a média da população deste dicionário de estados;\u001b[m");
        System.out.println(soma/order.size());
        System.out.println("\nRemova os estados com a população menor que 4.000.000;");
        Iterator<Double> iterator1 = order.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(4.039277)){
                iterator1.remove();
            }
        }
        System.out.println(order);
        System.out.println("\nApague o dicionário de estados;");
        order.clear();
        System.out.println("\u001b[5m Confira se o dicionário esta vazio:\u001b[m");
        System.out.println(order.isEmpty());

    }
}
