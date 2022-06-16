package criando.estruturarepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número para descobrir o fatorial:");
        int num = scan.nextInt();
        int multi = 1;
        for (int i = num; i >=1; i--) {
            multi = multi * i;
        }
        System.out.println(num+"! = "+multi);
    }
}
