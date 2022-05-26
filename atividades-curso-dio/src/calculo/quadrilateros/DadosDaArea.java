package calculo.quadrilateros;

public class DadosDaArea {
    private double area;
    //use sobrecarga

    public double area(double lado) {
        return lado * lado;
    }
    public double area(double base, double altura) {
        return base * altura;
    }
    public double area(double base1, double base2, double altura) {
        return (base1 + base2) * altura/2;
    }
    public double area(float base3, float base4) {
        return (base3 * base4)/2;
    }


}