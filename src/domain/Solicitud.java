package domain;

public class Solicitud { //implements Comparable<Solicitud> y pongo el override del compareTo
    private int prioridad;
    private String nombreSol;

    public Solicitud(int prioridad, String nombreSol) {
        this.prioridad = prioridad;
        this.nombreSol = nombreSol;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombreSol() {
        return nombreSol;
    }

    public void setNombreSol(String nombreSol) {
        this.nombreSol = nombreSol;
    }

    @Override
    public String toString() {
        return "Solicitud | " + " Prioridad = " + prioridad + ", Solicitante = " + nombreSol +".";
    }
}