package collectionset;

import java.util.Objects;

public class Linguagens {
    private String nome;
    private Integer ano;
    private String ide;

    public Linguagens(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens that = (Linguagens) o;
        return nome.equals(that.nome) && ano.equals(that.ano) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }
}
