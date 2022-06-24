package criando.estruturarepeticao;
import java.util.Scanner;
/*Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //criando entrada
        String[] consoantes = new String[6]; //o array é um objeto e deve ser inicializado
        int count = 0;
        int quantidade = 0;
        do{
            System.out.println("Informe 6 letras: ");
            String letra = entrada.next();
            /* Se aparecer a ou e ou i ou etc, essas letras não ! contar elas  junto com as consoantes*/
            if ( !(letra.equalsIgnoreCase("a") ||
             letra.equalsIgnoreCase("e") || // ignoreCase iginora se for maiusculo ou minisculo
             letra.equalsIgnoreCase("i") ||
             letra.equalsIgnoreCase("o") ||
             letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;// guarda dentro da posição iterada pelo contador a letra informada
                quantidade++; // guarda a quantidade de consoantes e armazena ele na menoria
            }
            count++; //controla o laço para não ocorrer o loop
        }while (count < consoantes.length); // compara se o contador ja chegou a mesma quantidade de elementos do array

        System.out.print("Consoantes: ");
        for (String consoante: consoantes) { // para cada elemento veridicado quero que pegue o valor dentro do array
            System.out.print(consoante +  " "); // valores indentificados ou seja os tais elementos
        }
        System.out.print("Quantidade de consoantes: "+quantidade);
    }
}
