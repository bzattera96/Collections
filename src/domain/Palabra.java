package domain;

import java.util.Objects;

public class Palabra implements Comparable<Palabra>{ //++contiene metodo int compareTo
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
        if (o == null || !(o instanceof Palabra)) return false; //si son instancias del padre
        Palabra palabra1 = (Palabra) o;
        return palabra.equals(palabra1.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    @Override
    public String toString() {
        return palabra + ": " + significado + ".";
    }

    //++
    @Override
    public int compareTo(Palabra o) {
        return this.palabra.compareTo(o.getPalabra()); //++orden opuesto: o.getPalabra().compareTo(this.palabra);
        //-n ubicar antes del que estoy comparando
        //+n por arriba: ubico donde más adelante
        //0
    }
}