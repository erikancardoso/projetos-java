package poo;
// classe que implementa a interface operacoes
public class Calculadora implements Operacoes{

    @Override
    public void somar(double var1, double var2) {
        System.out.println("Soma "+ var1+var2);
    }

    @Override
    public void multiplicar(double var1, double var2) {
        System.out.println("Multiplicação "+ var1+var2);
    }

    @Override
    public void dividir(double var1, double var2) {
        System.out.println("Divisão "+ var1+var2);
    }

    @Override
    public void subtrair(double var1, double var2) {
        System.out.println("Subtração "+ var1+var2);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
