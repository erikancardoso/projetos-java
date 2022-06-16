package criando.estruturarepeticao;
import java.util.Scanner;
public class MediaMaior {
    public static void main(String[] args) {
        /*Maior e Média: Faça um programa que leia 5 números e informe o" +
                " maior número e a média desses números.*/

        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int soma = 0;
        int contador = 0;
        do{
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            soma = soma + num;
            if (num > maior){
                maior = num;
            }
            contador++;
        }while(contador < 5);
        System.out.println("O maior valor digitado foi "+ maior);
        System.out.println("a média entre os valores é de: "+(soma/5));

    }
}
