package Ejercicio2;

class Pagos {
    private MetodoPago[] metodosPago;
    private int indice;

    public Pagos(int capacidad) {
        metodosPago = new MetodoPago[capacidad];
        indice = 0;
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        if (indice < metodosPago.length) {
            metodosPago[indice++] = metodoPago;
        } else {
            System.out.println("No se pueden agregar más métodos de pago.");
        }
    }

    public void realizarPago(double monto) {
        for (int i = 0; i < indice; i++) {
            metodosPago[i].realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (int i = 0; i < indice; i++) {
            if (metodosPago[i] instanceof Cancelable) {
                ((Cancelable) metodosPago[i]).cancelarPago();
            }
        }
    }

    public void mostrarMetodosPago() {
        for (int i = 0; i < indice; i++) {
            System.out.println(metodosPago[i]);
        }
    }
}