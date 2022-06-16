package criando.estruturarepeticao;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        /*Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
        e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)*/

        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Insira o nome do aluno");
            String nomeAluno = teclado.next();
            if (nomeAluno.equals("0")) break; //variavel string "", 1 linha no if, sem {}
            System.out.println("Insira a idade do aluno");
            int idadeAluno = teclado.nextInt();
        }

    }
}
