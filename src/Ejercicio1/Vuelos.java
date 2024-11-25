package Ejercicio1;


abstract class Vuelos {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelos(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Vuelo: " + numeroVuelo + " | Origen: " + origen + " | Destino: " + destino + " | Fecha: " + fecha;
    }
}