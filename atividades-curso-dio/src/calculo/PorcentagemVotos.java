package calculo;
import java.util.*;

public class PorcentagemVotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        System.out.println("Informe habitantes: ");
        int habitantes = input.nextInt();
        System.out.println("Informe brancos: ");
        int brancos = input.nextInt();
        System.out.println("Informe nulos: ");
        int nulos = input.nextInt();
        System.out.println("Informe validos: ");
        int validos = input.nextInt();
        //160 x 25% = 160 (25/100) = 160 x 0,25 = 40.
        int pBrancos = (brancos * 100) /habitantes;
        int pNulos = (nulos * 100 ) / habitantes;
        int pValidos = (validos * 100     )   /    habitantes;


        System.out.println("Brancos: " +   pBrancos  + "%");

       System.out.println("Nulos: " +    pNulos      + "%");

        System.out.println("Validos: " +   pValidos       + "%");
    }
}
//1000 100 150 750