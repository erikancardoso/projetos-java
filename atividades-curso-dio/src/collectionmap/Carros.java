package collectionmap;

import java.util.Objects;

public class Carros {
    private String modelo;
    private Integer consumo;

    public Carros(String modelo, Integer consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carros carros = (Carros) o;
        return modelo.equals(carros.modelo) && consumo.equals(carros.consumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, consumo);
    }
}



