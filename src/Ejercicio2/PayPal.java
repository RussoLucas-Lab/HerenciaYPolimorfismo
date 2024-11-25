package Ejercicio2;

class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;
    private boolean pagoRealizado;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago(double monto) {
        if (!pagoRealizado) {
            System.out.println("Pago de $" + monto + " realizado con PayPal: " + correoElectronico);
            pagoRealizado = true;
        } else {
            System.out.println("El pago ya fue realizado con esta cuenta PayPal.");
        }
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago cancelado para la cuenta PayPal: " + correoElectronico);
            pagoRealizado = false;
        } else {
            System.out.println("No hay pagos realizados para cancelar.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: PayPal | Correo Electrónico: " + correoElectronico;
    }
}