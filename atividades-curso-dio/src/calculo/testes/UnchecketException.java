package calculo.testes;

import javax.swing.*;


public class UnchecketException {
    //crie uma divisão de dois valores inteiros e peça para o usuário informar os valores
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador"); //mostra um imput na tela em caixa e armazena a String
        String b = JOptionPane.showInputDialog("Denominador");
        System.out.println(a + b); //o resultado será uma string


    }


    public static int dividir(int a, int b) {
        return a / b;
    }
}