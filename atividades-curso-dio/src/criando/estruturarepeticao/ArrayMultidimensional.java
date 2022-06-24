package criando.estruturarepeticao;

import java.util.Random;
/*
* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o
* menor número da matriz e a sua posição(linha, coluna).
* */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        //criando um gerador aleatorio de numeros
        Random aleatorio = new Random();
        // criando uma matrix de numeros inteiros
        int[][] M = new int[4][4]; // linhas e colunas
        //armazenar os valores aleatorios dentro da matrix
        for (int i = 0; i < M.length; i++){ //percorre a linha da matrix
            for (int j = 0; j < M[i].length; j++){ // percorre a coluna/elemento da matrix de acordo com as linhas
                M[i][j] = aleatorio.nextInt(9); // random coloca até x valor determinado pelo user
            }
        }
        for (int[] linhas: M) {
            for (int coluna: linhas) { // usar a coluna/ elemento da linha
                System.out.print(coluna + " "); // a coluna representa o elemento em si, ele é quem deve ser mostrado
            }
            System.out.println();
        }
    }
}
