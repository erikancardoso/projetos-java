package manipulando.hora;

import java.util.Scanner;

public class MainHora {
    public static void main(String[] args) {
        Hora hora = new Hora();
        Scanner teclado = new Scanner(System.in);
        String recebeHora;
        System.out.println("Digite a hora do dia!");
        recebeHora = teclado.nextLine();
        hora.setHora(recebeHora);
        System.out.println(hora.getHora());
    }
}
