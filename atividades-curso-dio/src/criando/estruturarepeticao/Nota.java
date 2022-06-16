package criando.estruturarepeticao;
 /*Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
        continue pedindo até que o usuário informe um valor válido.*/
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a nota (deve ser entre 0 e 10");
        int nota = teclado.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.println("Número inválido, digite novamente!");
                nota = teclado.nextInt(); // esse código impediu um loop
            }
        }
}


