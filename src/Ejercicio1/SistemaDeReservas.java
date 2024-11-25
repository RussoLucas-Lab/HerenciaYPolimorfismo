package Ejercicio1;

public class SistemaDeReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas(10);

        Vuelos vuelo1 = new VueloRegular("AJ052", "Mendoza", "Madrid", "2024-11-01", 150, 200.0);
        Vuelos vuelo2 = new VueloCharter("LR112", "Mexico", "Panamá", "2024-12-25", 5000.0);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        System.out.println("Vuelos antes de promociones:");
        reservas.mostrarVuelos();

        reservas.aplicarPromociones(10); // Aplicar 10% de descuento

        System.out.println("\nVuelos después de promociones:");
        reservas.mostrarVuelos();

        System.out.println("\nPrecio total de las reservas: " + reservas.calcularPrecioTotal());
    }
}