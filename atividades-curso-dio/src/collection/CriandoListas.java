package collection;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CriandoListas {
    public static void main(String[] args) {
        // criando list
        List<Double> notas = new ArrayList<>();
        // adicionando valores apos criada
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.2);
        notas.add(6d);
        //imprimir
        System.out.println(notas);

        //criando e adicionando juntos
        List<String> alunos = new ArrayList<>(Arrays.asList("Maria", "Joana", "Fernanda"));
        System.out.println(alunos);

        // adicionando por posição o elemento
        alunos.add(3, "Aline"); // na terceira posição o nome fernanda, começa a contar do zero
        System.out.println(alunos);

        //imprimindo com toString()
        System.out.println(notas.toString());

        //substituir valor x por outro valor y
        notas.set(notas.indexOf(6d), 10d);
        System.out.println(notas.toString());

        //substituir por indice
        alunos.set(2, "Cassia"); // segunda posição alterando de fernanda para cassia
        System.out.println(alunos.toString());

        //mostrar um elemento dentro da lista, retorno booleano
        System.out.println(notas.contains(8d));

        //mostrar um valor x por indice
        System.out.println(notas.get(3));

        //mostrar maior valor dentro da lista
        System.out.println(Collections.max(notas));
        System.out.println(Collections.max(alunos)); // como ele é string vai retornar o primeiro valor

        //mostrar o menor valor dentro da lista
        System.out.println(Collections.min(notas));
        System.out.println(Collections.min(alunos)); // como é string ele vai retornar o ultimo valor

    }
}
