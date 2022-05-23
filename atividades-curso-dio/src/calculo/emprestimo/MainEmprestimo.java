package calculo.emprestimo;

import java.util.Scanner;

public class MainEmprestimo {
    public static void main(String[] args) {
        DadosEmprestimo calculo = new DadosEmprestimo();
        Scanner teclado = new Scanner(System.in);
        double a;
        int b;
        System.out.println("Informe o valor que deseja emprestar: ");
        a = teclado.nextDouble();
        System.out.println("Informe em quantas parcelas precisa dividir: ");
        b = teclado.nextInt();
        calculo.setValor(a);
        calculo.setTempo(b);
        System.out.println("O valor do emprestimo com juros ficou: "+ calculo.getValor());
        System.out.println("em " + calculo.getTempo() + " parcelas de R$: "+ calculo.getValor()/ calculo.getTempo());
    }
}
