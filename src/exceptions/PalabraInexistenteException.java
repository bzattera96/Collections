package exceptions;

public class PalabraInexistenteException extends RuntimeException { //lo llamo singular cuando es homogeneo
    // si es Runtime, es unchecked (tiempo de ejecución)
    private String descripcion;

    public PalabraInexistenteException(String descripcion) {
        super(descripcion);
    }
}

//si exiende Exception, no puedo usar throw (excepción check)
//como aviso previamente
//public void buscarPalabra(String palabra) throws PalabraInexistenteExcepction
//main: diccionario1.buscarPalabra("Excepción") lo tengo que modificar
// try/catch + manejo(sout(e.getMessage());