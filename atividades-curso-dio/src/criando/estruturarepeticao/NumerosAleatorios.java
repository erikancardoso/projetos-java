package criando.estruturarepeticao;

import java.util.Scanner;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 Ao final, mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numerosInteiros = new int[20];
        int mostrarNumero = 0;
        int count = 0;
        do{
            System.out.println("Informe um número aleatório entre 0 e 100: ");
            int numero = scan.nextInt(); // recebe o valor do teclado
            if ( numero >= 0 && numero <= 100){
                numerosInteiros[count] = numero; // inserir na posição indicada pelo contador o valor do elemento
                mostrarNumero++; // continuar de onde parou soma e atribue.
            }else {
                System.out.println("Número informado não condiz com o enunciado");
            }
            count++; // controla o fluxo do laço
        }while ( count < numerosInteiros.length);

        System.out.println("Numeros contidos nos arrays");
        for (int verificador : numerosInteiros) {
            System.out.print(verificador + " "); // verificar o valor e mostrar em tela
        }
        System.out.println("\nNúmeros sucessores: ");
        for ( int verificador: numerosInteiros) {
            System.out.print(verificador+1 + " ");
        }
    }
}
