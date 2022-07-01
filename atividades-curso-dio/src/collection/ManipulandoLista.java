package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ManipulandoLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,5,6,10));

        //mostrar a lista por ordem de inserção
        for (int mostrar: numeros) System.out.println(mostrar);

        //mostrar a soma dos valores
        Iterator<Integer> iterador = numeros.iterator(); // criei um objeto de iteração que garda a quantidade de loops
        int soma = 0; // criar variavel responsavel pela soma e guardar os valores somados
        while (iterador.hasNext()){ // hasNext verificar se o iterador possui proximos elementos
            int proximoElementos = iterador.next(); //gardando a variavel que servira para a soma.
            soma += proximoElementos; // soma e atribui os valores
        }
        System.out.println("A soma entre os valores é: "+ soma);
        //exibir a media da soma
        System.out.println("A média é: "+soma/numeros.size());// size ira retornar o tamanho do objeto

        //remover x valor por index
        numeros.remove(2);
        System.out.println("removendo o valor 6: "+numeros.toString());
        // remover x valor por objeto
        numeros.remove(10);
        System.out.println("removendo o valor 6: "+numeros.toString());

    }
}
