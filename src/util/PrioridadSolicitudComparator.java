package util;

import domain.Solicitud;

import java.util.Comparator;

public class PrioridadSolicitudComparator implements Comparator<Solicitud> { //si pongo solicitud, después implemento métodos

    @Override
    public int compare(Solicitud o1, Solicitud o2) {
        int auxResultado = 0; //0 iguales, 1 por arriba, -1 por debajo
        if (o1.getPrioridad() > o2.getPrioridad()) {
            auxResultado = 1;
        } else if (o1.getPrioridad() < o2.getPrioridad()) {
            auxResultado = -1;
        }
        return auxResultado;
    }
}