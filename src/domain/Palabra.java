package domain;

import java.util.Objects;

public class Palabra {
    protected String palabra;
    protected String significado;
    protected String idioma;

    public Palabra(String palabra, String significado, String idioma) {
        this.palabra = palabra;
        this.significado = significado;
        this.idioma = idioma;
    }

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }


    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getIdioma() {
        return idioma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra1 = (Palabra) o;
        return palabra.equals(palabra1.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    @Override
    public String toString() {
        return palabra + ": " + significado;
    }
}