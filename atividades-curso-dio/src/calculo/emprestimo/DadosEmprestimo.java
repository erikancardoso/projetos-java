package calculo.emprestimo;

public class DadosEmprestimo {
    private double valor;
    private int tempo;

    public DadosEmprestimo() {
        System.out.println("Calcular valor de emprestimo!");
    }

    public double getValor() {
        return valor + (valor * 5.36)/100;
    }
    public void setValor(double valor) {
        this.valor = valor;
        if(valor <= 0) {
            System.out.println("Não é possível emprestar valores negativos");
            return;
        }
        this.valor = valor;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;

    }
}
