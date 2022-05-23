package manipulando.hora;

public class Hora {
    private String hora;

    public Hora() {
        System.out.println("Relógio!");
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
        switch (hora){
            case "1":
                System.out.println("Bom dia!");
                break;
            case "2":
                System.out.println("Bom dia!");
                break;
            case "3":
                System.out.println("Bom dia!");
                break;
            case "12":
                System.out.println("Boa tarde!");
                break;
            case "13":
                System.out.println("Boa tarde!");
            case "19":
                System.out.println("Boa noite!");
                break;
            case "20":
            System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Escolha a hora de 1 a 24 para receber a saudação!");
        }
    }
}
