package criando.metodos;

public class Calculadora {
    private int somar;
    private int subtrair;
    private int multiplicar;
    private double dividir;

    public Calculadora() {
        System.out.println("Calculadora!");
    }

    public int getSomar() {
        return somar;
    }

    public void setSomar(int a, int b) {
        this.somar = a + b;
    }

    public int getSubtrair() {
        return subtrair;
    }

    public void setSubtrair(int a, int b) {
        this.subtrair = a - b;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(int a, int b) {
        this.multiplicar = a * b;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double a, double b) {
        this.dividir = a / b;
    }
}
