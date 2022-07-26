package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsApi {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1","4","1","2","0","7","8","9","6");
        /*System.out.println("imprimir elementos dessa list com stream");
        numeros.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        System.out.println("imprimir elementos dessa list");
        //numeros.stream().forEach(s -> System.out.println(s)); //com stream e lambda
        numeros.forEach(System.out::println); //usando reference Method
        System.out.println("Pegue os 5 primeiros numeros e coloque dentro do set");
        Set<String> colecoes = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(colecoes); // obs set não mostra valores duplicados
        // se não tiver dentro da coleção pode usar o foreach para inprimir com o reference method
        System.out.println("Transforme uma lista de string em lista de inteiros");
        /*numeros.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/
        //numeros.stream().map(s -> Integer.parseInt(s)); // usando lambda
        numeros.stream()
                .map(Integer::parseInt) //usando reference method
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 ==0 && i > 2)
                .forEach(System.out::println);
        System.out.println("Mostre a média dos numeros");
        numeros.stream()
                .mapToInt(value -> Integer.parseInt(value))
                .average()
                .ifPresent(System.out::println);
        System.out.println("Remova os numeros impares da lista");
        List<Integer> inteiros = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        inteiros.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer valor) {
                if (valor % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(inteiros);

    }
}
