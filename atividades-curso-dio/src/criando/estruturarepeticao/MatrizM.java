package criando.estruturarepeticao;
import java.util.Random;
import java.util.Arrays;
public class MatrizM {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int[][] M = new int[10][10];
        for (int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = aleatorios.nextInt(9);
            }
        }
        for (int[] lista: M) {
            for (int coluna: lista) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
