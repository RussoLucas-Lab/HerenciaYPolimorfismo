package Ejercicio2;

class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;
    private boolean pagoRealizado;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago(double monto) {
        if (!pagoRealizado) {
            System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito: " + numero);
            pagoRealizado = true;
        } else {
            System.out.println("El pago ya fue realizado con esta tarjeta.");
        }
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago cancelado para la tarjeta de crédito: " + numero);
            pagoRealizado = false;
        } else {
            System.out.println("No hay pagos realizados para cancelar.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Tarjeta de Crédito | Fecha de Expiración: " + fechaExpiracion;
    }
}
