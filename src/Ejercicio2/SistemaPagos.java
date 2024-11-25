package Ejercicio2;

public class SistemaPagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos(5);

        // Crear métodos de pago
        MetodoPago tarjeta = new TarjetaCredito("Lucas", "1234-5678-9012-3456", "12/26", "123");
        MetodoPago paypal = new PayPal("Lucas", "9999", "lucas@gmail.com");

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        // Mostrar métodos de pago
        System.out.println("Métodos de Pago:");
        pagos.mostrarMetodosPago();

        // Realizar pagos
        System.out.println("\nRealizando pagos:");
        pagos.realizarPago(150.75);

        // Cancelar pagos
        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();

        // Mostrar métodos de pago después de cancelar
        System.out.println("\nMétodos de Pago después de cancelar:");
        pagos.mostrarMetodosPago();
    }
}