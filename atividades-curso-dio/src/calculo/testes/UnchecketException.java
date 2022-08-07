package calculo.testes;

import javax.swing.*;


public class UnchecketException {
    //crie uma divisão de dois valores inteiros e peça para o usuário informar os valores
    public static void main(String[] args) {

        boolean tenteNovamente = true;
        do {
                String a = JOptionPane.showInputDialog("Numerador"); //mostra um imput na tela em caixa e armazena a String
                String b = JOptionPane.showInputDialog("Denominador");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b)); // parsando string para tipo inteiro
                System.out.println(resultado);
                tenteNovamente = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"entrada invalida, informe um numero!"+e.getMessage());
                //e.printStackTrace();
             }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"não é possível dividir um numero por "+e.getMessage());
            } finally {
                System.out.println("Chegou ao finally");
            }
                System.out.println("O codigo continua...");
        }while (tenteNovamente);

    }


    public static int dividir(int a, int b) {
        return a / b;
    }
}