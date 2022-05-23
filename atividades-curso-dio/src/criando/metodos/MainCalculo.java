package criando.metodos;
import java.util.Scanner;
public class MainCalculo {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro Número: ");
        a = teclado.nextInt();
        System.out.println("Digite o segundo Número: ");
        b = teclado.nextInt();
        calculo.setSomar(a,b);
        calculo.setSubtrair(a,b);
        calculo.setMultiplicar(a,b);
        calculo.setDividir(a,b);
        System.out.println("Soma: " + calculo.getSomar());
        System.out.println("Subtração: " + calculo.getSubtrair());
        System.out.println("Multiplicação: " + calculo.getMultiplicar());
        System.out.println("Divisão: " + calculo.getDividir());

    }
}
