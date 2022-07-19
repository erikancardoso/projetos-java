package collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinguagens {
    public static void main(String[] args) {
        Set<Linguagens> linguagem = new LinkedHashSet<>(){
            {
                add(new Linguagens("Java", 1991, "IntellijIDEA"));
                add(new Linguagens("Python", 1989, "Jupyter"));
                add(new Linguagens("SQL", 1974, "JetBrains DataGrip"));
                add(new Linguagens("Java", 1991, "Eclipse"));
            }
        };
        System.out.println("Ordem de inserção");
        for (Linguagens insercao: linguagem) {
            System.out.println(insercao);
        }
    }
}
