package collection;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getName().compareToIgnoreCase(o2.getName());
        if (nome != 0) return nome;

        int cor = o1.getColor().compareToIgnoreCase(o2.getColor());
        if (cor != 0 ) return cor;

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
