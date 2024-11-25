package Ejercicio1;

class VueloRegular extends Vuelos implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentaje) {
        precioBasePorAsiento -= precioBasePorAsiento * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Regular | Precio Total: " + calcularPrecio();
    }
}