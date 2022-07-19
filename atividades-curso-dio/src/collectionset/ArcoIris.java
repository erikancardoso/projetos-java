package collectionset;

import java.util.Objects;

public class ArcoIris implements Comparable<ArcoIris> {
    private String cor;

    public ArcoIris(String cor) {
        this.cor = cor;

    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    //para resolver com set preciso sobrescrever hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(cor, arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public int compareTo(ArcoIris o) {
        return this.getCor().compareToIgnoreCase(o.getCor()); // ignorecase faz comparação de strings
    }
}
