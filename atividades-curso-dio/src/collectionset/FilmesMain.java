package collectionset;

import collectionlist.Gato;

import java.util.*;
import java.util.Collections;

public class FilmesMain {
    public static void main(String[] args) {
        // resolver usando Set
        Set<Filmes> meusFilmes = new HashSet<>() {
            {
            add(new Filmes("Dark", "Drama", 60));
            add(new Filmes("Raised by Wolves", "Ficção Cientifica", 30));
            add(new Filmes("Stranger Things", "Suspense", 40));
            add(new Filmes("Stranger Things", "Suspense", 40));

            }
        };
        System.out.println("Ordem Aleatorio com HashSet");
        for (Filmes mostrar: meusFilmes) {
            System.out.println(mostrar.toString());
        }
        System.out.println("\nOrdem de Inserção com LinkedHashSet");
        // imprimir em ordem natural, preciso transferir tudo para o LinkedHashSet
        Set<Filmes> ordemFilmes = new LinkedHashSet<>(){
            {
                add(new Filmes("Harry Potter", "Fantasia", 7));
                add(new Filmes("As cronicas de Narnia", "fantasia", 3));
                add(new Filmes("A fabrica de chocolate", "fantasia", 2));
            }
        };
        for (Filmes ordem: ordemFilmes) {
            System.out.println(ordem);
        }
        System.out.println("\nOrdem Natural por nome com TreeSet");
        Set<Filmes> nomeFilmes = new TreeSet<>(new CompararNome());
        nomeFilmes.addAll(meusFilmes);
        for (Filmes nome: nomeFilmes) {
            System.out.println(nome);
        }

        System.out.println("\nOrdem Natural por episodio com TreeSet");
        // nesse caso não preciso passar por parametro a coleção pq ja esta implementada na class Filmes e sobrescrito
        Set<Filmes> episodioFilmes = new TreeSet<>(meusFilmes);

        for (Filmes episodio: episodioFilmes) {
            System.out.println(episodio);
        }
        System.out.println("\nOrdem Natural por genero com TreeSet");
        Set<Filmes> generoFilmes = new TreeSet<>(new CompararGenero());
        generoFilmes.addAll(meusFilmes);
        for ( Filmes genero: generoFilmes) {
            System.out.println(genero);
        }

        System.out.println("\nOrdem Natural por NomeGeneroEpisodio com TreeSet");
        Set<Filmes> comparandoFilmes = new TreeSet<>(new CompararNomeGeneroEpisodio());
        comparandoFilmes.addAll(meusFilmes);

        for (Filmes comparacao: comparandoFilmes) {
            System.out.println(comparacao);
        }

    }
}



class CompararNomeGeneroEpisodio implements Comparator<Filmes>{
    @Override
    public int compare(Filmes o1, Filmes o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(o1.getEpisodio(), o2.getEpisodio());
    }
}


class CompararNome implements Comparator<Filmes>{
    @Override
    public int compare(Filmes n1, Filmes n2) {
        int nome = n1.getNome().compareTo(n2.getNome());
        if (nome != 0) return nome;

        return Integer.compare(n1.getEpisodio(), n2.getEpisodio());
    }
}


class CompararGenero implements Comparator<Filmes>{
    @Override
    public int compare(Filmes g1, Filmes g2){
        int genero = g1.getGenero().compareTo(g2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(g1.getEpisodio(), g2.getEpisodio());
    }
}



class Filmes implements Comparable<Filmes>{
    private String nome;
    private String genero;
    private Integer episodio;

    public Filmes(String nome, String genero, Integer episodio) {
        this.nome = nome;
        this.genero = genero;
        this.episodio = episodio;
    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getEpisodio() {
        return episodio;
    }

    @Override
    public String toString() {
        return "" +
                "'" + nome + '\'' +
                ", '" + genero + '\'' +
                ", " + episodio +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return nome.equals(filmes.nome) && genero.equals(filmes.genero) && episodio.equals(filmes.episodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, episodio);
    }


    @Override
    public int compareTo(Filmes o) {
        int e = Integer.compare(this.getEpisodio(), o.getEpisodio());
        if (e != 0) return e;

        return this.getGenero().compareTo(o.getGenero());
    }
}

