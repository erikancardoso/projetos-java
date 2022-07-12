package collection;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato c1, Gato c2) {
        return c1.getColor().compareToIgnoreCase(c2.getColor()); //comparação de strings se == 0 se ! 1
    }
}
