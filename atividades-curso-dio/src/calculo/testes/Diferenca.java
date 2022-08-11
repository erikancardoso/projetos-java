package calculo.testes;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//TODO:Escreva um programa que, dada a pressão desejada digitada pelo motorista e a pressão do pneu lida pela bomba,
// indica a diferença entre a pressão desejada e a pressão lida.
        int N = scan.nextInt(); //pressão desejada 1 ≤ N ≤ 40
        int M = scan.nextInt(); // pressao lida pela bomba 1 ≤ M ≤ 40
        if (N!= M)
            System.out.println(N-M);
    }
}
