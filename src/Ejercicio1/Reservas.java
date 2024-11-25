package Ejercicio1;

class Reservas {
    private Vuelos[] vuelos;
    private int indice;

    public Reservas(int capacidad) {
        vuelos = new Vuelos[capacidad];
        indice = 0;
    }

    public void agregarVuelo(Vuelos vuelo) {
        if (indice < vuelos.length) {
            vuelos[indice++] = vuelo;
        } else {
            System.out.println("No se pueden agregar más vuelos.");
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += vuelos[i].calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double porcentaje) {
        for (int i = 0; i < indice; i++) {
            if (vuelos[i] instanceof Promocionable) {
                ((Promocionable) vuelos[i]).aplicarPromocion(porcentaje);
            }
        }
    }

    public void mostrarVuelos() {
        for (int i = 0; i < indice; i++) {
            System.out.println(vuelos[i]);
        }
    }
}