package criando.estruturarepeticao;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        /*Par e Ímpar: Faça um programa que peça N números inteiros. " +
                "Calcule e mostre a quantidade de números pares e a quantidade de números impares.\n" +
                "\n"*/
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int par = 0;
        int impar = 0;
        System.out.println("Informe a quantidade de numeros precisa: ");
        int quantNum = scan.nextInt();
        do {
            System.out.println("Informe um número: ");
            int num = scan.nextInt();
            if(num%2 == 0) {
                par++;
            }else{
                impar++;
            }
            cont++;
        }while (cont < quantNum);
        System.out.println(par+" números pares");
        System.out.println(impar+ " números impares");
    }
}
