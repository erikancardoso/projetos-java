package calculo.operadoresRelacionais;

public class Testando {
    public static void main(String[] args) {
        int i1=10;
        int i2=20;
        float f1=4.5f;
        float f2=3.5f;
        double d1=4.5d;
        double d2=6.8d;
        char c1='z';
        char c2='y';
        String s2="maria";
        String s1="joao";
        boolean b1=true;
        boolean b2=false;
        if (i1==i2){
        System.out.println("Sim");
        }else{
            System.out.println("não");
        }
        if (f1 != f2){
            System.out.println("são diferentes");
        }else{
            System.out.println("não são diferentes");
        }
        if (s2 == s1){ //não faz comparação ( >= , >, <, <=)
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if (c1 > c2){// por causa da tabela ASCII
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
        if (i1 > f1){
            System.out.println("int maior que float, sim");
        }else{
            System.out.println("int maior que float, não");
        }
        if (f2 == d2){
            System.out.println("float igual a double, sim");
        }else{
            System.out.println("float igual a double, não");
        }
        if (b1 == b2){ //não roda, (<,>,<=,>=)(outros tipos de dados diferentes de booleanos)
            System.out.println("boolean 1 é igual a boolean 2, sim");
        }else{
            System.out.println("boolean 1 é igual a boolean 2, não");
        }
    }
}
