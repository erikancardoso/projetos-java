package calculo.testes;

import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vel = scan.nextInt();
        System.out.println("consulta");

        if (vel > 1000){
            System.out.println("super");
        }else if(vel > 500){
            System.out.println("mega");
        }else {
            System.out.println("basico");
        }
    }
}
