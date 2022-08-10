package calculo;
import java.util.*;
public class Desconto {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        System.out.println("informe o valor do desconto");
        int desconto = input.nextInt();
        System.out.println("Informe o preço antigo");
        int precoAntigo = input.nextInt();

        int precoNovo = precoAntigo - (precoAntigo * desconto / 100 );
        System.out.println( precoNovo );
    }
}
