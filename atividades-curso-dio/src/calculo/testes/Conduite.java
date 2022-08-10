package calculo.testes;

import java.io.IOException;
import java.util.Scanner;

public class Conduite {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); // quantas vezes irá repetir

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        for (int i = 0; i < T; i++) {
            int R1, R2 = scan.nextInt();
            //int R2 = scan.nextInt();
            if(R1 < R2){ //verificar qual o menor raio
                System.out.print(R1); // caso R1 menor que R2
            } else {
                System.out.print(R2); // senão R2 menor
            }
        }
    }
}
