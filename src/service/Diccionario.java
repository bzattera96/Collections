package service;

import domain.Palabra;
import exceptions.PalabraInexistenteException;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diccionario {
    private String idioma;
    private Set<Palabra> palabras; // private Queue<Urgencia> urgencias;
    // this.urgencias = new PriorityQueue<>();

    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras = new TreeSet<>(); //al agregar TreeSet, tengo que hacer cambios ++
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
            throw new PalabraInexistenteException("La palabra " + palabra + " no existe en el diccionario.");
            // al inicializarlo, me lo crea cuando se rompe el programa
        }
    }

    public void removerPalabra(String palabra) {
        boolean seEncontro = false;
        for (Palabra palabraEnDiccionario : palabras) {
            //foreach (1. Tipo de Dato a recorrer (obj) 2. auxiliar local : 3. De donde saco eso)
            if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                seEncontro = true;
                palabras.remove(palabraEnDiccionario);
                System.out.println("Se removió la palabra: " + palabra + ".");
                break;
            }
        }
        if (!seEncontro) {
            System.out.println("La palabra " + palabra + " no se encuentra en el diccionario.");
        }
    }
    //Remove directamente busca, por eso es que con palabras.remove()
    //public void removerPalabra(String palabra) {
    //Palabra palabraARemover = new Palabra(palabra); vuelvo el string objeto palabra para pasarlo al remove
    //boolean seRemovio = palabras.remove(palabraARemover);
    //if (seRemovio) {

    public void imprimirPalabras() {
        for (Palabra auxiliar : palabras){
            System.out.println(auxiliar.getPalabra());
        }
    }
}