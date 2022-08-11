package calculo.testes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReservatorioArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); // duas casas decimais após a vírgula
        double V, D, R, area, altura;

//TODO: Qual deve ser a altura(em cm) da parte interna do recipiente;A área(em cm2) da boca(entrada) do recipiente.Considere π = 3.14
        while (leitor.hasNext()) { //enquanto o leitor verificar uma proxima entrada faça
            V = leitor.nextDouble(); // volume V = 4/3 πr³
            D = leitor.nextDouble(); // diametro
            R = D / 2d; // diametro do raio
            area = 3.14 * Math.pow(R, 2d);
            altura = V / area;
            System.out.println("ALTURA = " + df.format(altura)); // ln quebra de lina=ha
            System.out.println("AREA = " + df.format(area));
        }
    }
}
