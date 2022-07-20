package collectionset;

import java.util.Comparator;

public class ComparatorAno implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens a1, Linguagens a2) {
        return Integer.compare(a1.getAno(),a2.getAno());
    }
}
