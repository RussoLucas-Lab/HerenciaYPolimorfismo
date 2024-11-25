package Ejercicio2;

abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);

    @Override
    public String toString() {
        return "Titular: " + titular + " | Número: " + numero;
    }
}
