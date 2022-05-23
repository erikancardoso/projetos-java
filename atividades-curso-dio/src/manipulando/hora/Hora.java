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
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "11":
                System.out.println("Bom dia!");
                break;
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
                System.out.println("Boa tarde!");
                break;
            case "19":
            case "20":
            case "21":
            case "22":
            case "23":
            case "24":
            case "25":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Escolha a hora de 1 a 24 para receber a saudação!");
        }
    }
}
