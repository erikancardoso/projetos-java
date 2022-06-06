package calculo.operadoresLogicos;

public class MainLogico {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        int e = 2;
        int f = 6;
        int g = 1;
        int h = 5;

        System.out.println("true and false = "+ (a && b));
        System.out.println("true and true = "+ (a && c));
        System.out.println("false or true = "+ (b || c));
        System.out.println("true Xor true = "+ (a ^ c));
        System.out.println("true Xor false = "+ (a ^ b));
        System.out.println("false Xor false = "+ (d ^ b));
        System.out.println("Not false = "+ (!b));
        //expressão numérica, operação relacional e lógico
        System.out.println("(2+1)maior(6-5) and true = "+ ((e + g)>(f - h) && true));
        System.out.println("(2+1)menor(6-5) and true = "+ ((e + g)<(f - h) && true));
        System.out.println("(2 maior 1)or(6 menor 5) = "+ ((e > g)||(f < h)));
        System.out.println("(2 menor 1)or(6 menor 5) = "+ ((e < g)||(f < h)));

        
    }
}
