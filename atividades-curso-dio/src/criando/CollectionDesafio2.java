package criando;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CollectionDesafio2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para vítima? ");
        String resposta = scanner.next(); // scanner insere os dados em uma variavel
        respostas.add(resposta.toLowerCase());

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase()); // adiciona dados dentro do array
        // toLowerCase converte os caracteres em string em letras minusculas

        System.out.println(respostas);

        int count = 0; //inicializando contados

        // Iterator Retorna um iterador sobre os elementos nesta lista na sequência correta
        Iterator<String> contador = respostas.iterator(); // criando objeto contador
        while(contador.hasNext()){ // hasNext Retorna true se a iteração tiver mais elementos.
            String resp = contador.next();
            if(resp.contains("s")) { // verifica se contem s
                count ++; // armazena a quantidade de s
            }
        }

        switch(count) { // caso os s
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}

