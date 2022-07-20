package collectionset;

import java.util.Comparator;

public class ComparatorANI implements Comparator<Linguagens> {


    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        int ano = o1.getAno().compareTo(o2.getAno());
        if (ano != 0) return ano;

        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}
