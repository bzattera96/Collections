package service;

import domain.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int consec;
    private List<Libro> libros;

    public Biblioteca() {
        this.consec = 0;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libroAIngresar) {
        libros.add(libroAIngresar);
    }

    public void etiquetarLibro() {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo() == null) {
                libros.get(i).setCodigo(libros.get(i).getTitulo() + "/" + libros.get(i).getAño() + "/" + consec);
                consec++;
            }
        }
    }

    public List buscarLibro(String tituloABuscar) {
        List<Libro> auxiliar = new ArrayList<>();
        //creamos lista auxiliar para devolver libros con titulo igual al titulo buscado
        for (int i = 0; i < libros.size(); i++) { //recorrer lista para buscar el titulo entre todos los libros
            if (libros.get(i).getTitulo().equals(tituloABuscar) == true) { //si el titulo buscado corresponde al titulo del libro
                auxiliar.add(libros.get(i)); //agrego el libro a la lista auxiliar para devolver el resultado de la busqueda
            }
        }
        return auxiliar; //devuelvo la lista de libros con ese titulo
    }

    public void imprimirLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).getTitulo() + "/" + libros.get(i).getAutor() + "/" + libros.get(i).getAño() + "/" + libros.get(i).getCodigo());
        }
    }
}
