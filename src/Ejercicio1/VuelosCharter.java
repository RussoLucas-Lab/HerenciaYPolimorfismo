package Ejercicio1;

class VueloCharter extends Vuelos implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double porcentaje) {
        precioTotal -= precioTotal * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Charter | Precio Total: " + calcularPrecio();
    }
}