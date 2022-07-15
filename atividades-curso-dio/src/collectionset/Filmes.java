package collectionset;

import collectionlist.Gato;

public class Filmes implements Comparable<Filmes>{
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
        return "Filmes{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", episodio=" + episodio +
                '}';
    }
    @Override
    public int compareTo(Filmes f) { //ele guarda o valor em int e organiza em ordem
        return this.getNome().compareToIgnoreCase(f.getNome()); // ignorecase faz comparação de strings
    }
}
