package criando.estruturarepeticao;
/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7};
        System.out.println("elementos = "+vetor.length);
        System.out.println("espaço na memoria =  "+vetor);
        System.out.println("posição do elemento =  "+vetor[1]);

        System.out.println("Vetores ");
        int contador = 0;
        while(contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++; //para não entrar em loop eterno.
        }

        //ordem inversa

        System.out.println("\nMostrando os valores em ordem inversa ");
        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}

