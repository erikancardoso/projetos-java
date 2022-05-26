package calculo.quadrilateros;

import java.util.Scanner;

public class MainArea {
    public static void main(String[] args) {
        DadosDaArea calculo = new DadosDaArea();
        double quadrado = calculo.area(17);
        System.out.println(quadrado+"cm2");
        double retangulo = calculo.area(10d,5d);
        System.out.println(retangulo+"cm2");
        double trapezio = calculo.area(5,15,8);
        System.out.println(trapezio+"cm2");
        double losango = calculo.area(5f,5f);
        System.out.println(losango+"cm2");
        /*especificar tipo de dado diferentes para a sobrecarga do metodo em sua assinatura não confundir
        * os tipos de dados,  e entregar resultados indesejados. Sobrecarga(a assinatura é preservada nome e
        * parametros)*/
    }
}
