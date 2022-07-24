package service;

import domain.Palabra;

import java.util.HashSet;
import java.util.Set;

public class Diccionario {
    private String idioma;
    private Set<Palabra> palabras;

    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras = new HashSet<>();
    }

    public String getIdioma() {
        return idioma;
    }

    public void registrarPalabra(Palabra palabra) {
        palabras.add(palabra);
    }

    public void buscarPalabra(String palabra) {
        boolean seEncontro = false;
        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                System.out.println(palabraEnDiccionario);
                seEncontro = true;
                break;
            }
        }
        if (!seEncontro) {
            System.out.println("La palabra " + palabra + " no existe en el diccionario.");
        }
    }

    public void removerPalabra(String palabra) {

    }

    public void imprimirPalabras() {

    }
}