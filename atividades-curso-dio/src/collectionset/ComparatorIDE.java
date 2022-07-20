package collectionset;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}
