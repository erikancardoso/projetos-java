package collectionlist;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}
