package criando;

import java.util.*;

public class CollectionDesafio3 {
    public static void main(String[] args) {

        //Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene em uma lista
        List<Double> temperatura = new ArrayList<>();
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho"));
        Scanner scan = new Scanner(System.in);

        for (String mes : meses) {
            System.out.println("Informe a temperatura de " + mes);
            temperatura.add(scan.nextDouble());
        }
        System.out.println("Lista de temperaturas"+ temperatura);

        // calcule a média semestral
        Iterator<Double> iterador = temperatura.iterator();
        int soma = 0;
        while (iterador.hasNext()){
            Double calculo = iterador.next();
            soma += calculo;
        }
        System.out.println("A média é: "+soma/temperatura.size());

        // mostre as temperaturas acima da média semestral
        System.out.println("A maior temperatura: " + Collections.max(temperatura));

        System.out.println("mostrar os meses que ocorreram os pico máximo de temperatura, foi no mês de: ");
        Iterator<Double> contador = temperatura.iterator();
        int count = 0;
        int posicao = 0;
        while (contador.hasNext()) {
            Double grau = contador.next();
            if (grau == Collections.max(temperatura)) {
                posicao = count + 1;
            }
            count++;
        }
        switch (posicao) {
            case 1:
                System.out.println(meses.get(0));
                break;
            case 2:
                System.out.println(meses.get(1));
                break;
            case 3:
                System.out.println(meses.get(2));
                break;
            case 4:
                System.out.println(meses.get(3));
                break;
            case 5:
                System.out.println(meses.get(4));
                break;
            case 6:
                System.out.println(meses.get(5));
        }
    }
}
