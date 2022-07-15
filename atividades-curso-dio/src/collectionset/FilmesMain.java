package collectionset;

import collectionlist.Gato;

import java.util.*;

public class FilmesMain {
    public static void main(String[] args) {
        // resolver usando Set
        Set<Filmes> meusFilmes = new HashSet<>() {
            {
            add(new Filmes("Dark", "Drama", 60));
            add(new Filmes("Raised by Wolves", "Ficção Cientifica", 30));
            add(new Filmes("Stranger Things", "Suspense", 40));
            }
        };
        //imprimir filmes
        for (Filmes mostrar: meusFilmes) {
            System.out.println(mostrar);
        }
        // imprimir em ordem aleatoria

    }
}
