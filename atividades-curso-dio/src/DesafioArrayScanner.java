
import java.io.IOException;
import java.util.Scanner;


public class DesafioArrayScanner {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nQuantos palavras quer inserir? ");
        String[] words = new String[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < words.length; i++) {
            System.out.print("Qual é a " + (i + 1) + "ª palavra? ");
            words[i] = sc.nextLine();
        }
        System.out.println("\nQual posição deseja acessar:");
        int pos = sc.nextInt();
        System.out.println(words[pos-1]);
    }
}


