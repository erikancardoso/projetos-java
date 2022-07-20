package collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainLinguagens {
    public static void main(String[] args) {
        Set<Linguagens> linguagem = new LinkedHashSet<>(){
            {
                add(new Linguagens("Python", 1989, "Jupyter"));
                add(new Linguagens("SQL", 1974, "JetBrains DataGrip"));
                add(new Linguagens("Java", 1991, "IntellijIDEA"));
                add(new Linguagens("Java", 1991, "Eclipse"));
            }
        };
        System.out.println("\nOrdem de inserção");
        for (Linguagens insercao: linguagem) {
            System.out.println(insercao);
        }

        System.out.println("\nOrdem Natural Nome: ");
        Set<Linguagens> ordemLinguagem = new TreeSet<>(linguagem);
        for (Linguagens verOrdem: ordemLinguagem) {
            System.out.println(verOrdem.getNome());
        }
        System.out.println("\nOrdem Natural IDE: ");
        Set<Linguagens> ordemIde = new TreeSet<>(new ComparatorIDE());
        ordemIde.addAll(linguagem);
        for (Linguagens verOrdemIde: ordemIde) {
            System.out.println(verOrdemIde.getIde());
        }

        System.out.println("\nOrdem Natural Ano: ");
        Set<Linguagens> ordemAno = new TreeSet<>(new ComparatorAno());
        ordemAno.addAll(linguagem);
        for (Linguagens verOrdemAno: ordemAno) {
            System.out.println(verOrdemAno.getAno());
        }
        System.out.println("ordem ano/nome/ide");
        Set<Linguagens> ordemANI = new TreeSet<>(new ComparatorANI());
        ordemANI.addAll(linguagem);
        for (Linguagens verANI: ordemANI) {
            System.out.println(verANI.getAno()+ " - " +verANI.getNome()+" - "+verANI.getIde());
        }

    }
}
