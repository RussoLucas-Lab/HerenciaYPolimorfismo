package Ejercicio3;

class Notificaciones {
    private CanalNotificacion[] canales;
    private int indice;

    public Notificaciones(int capacidad) {
        canales = new CanalNotificacion[capacidad];
        indice = 0;
    }

    public void agregarCanal(CanalNotificacion canal) {
        if (indice < canales.length) {
            canales[indice++] = canal;
        } else {
            System.out.println("No se pueden agregar más canales de notificación.");
        }
    }

    public void enviarNotificaciones() {
        for (int i = 0; i < indice; i++) {
            canales[i].enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (int i = 0; i < indice; i++) {
            if (canales[i] instanceof Personalizable) {
                ((Personalizable) canales[i]).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarCanales() {
        for (int i = 0; i < indice; i++) {
            System.out.println(canales[i]);
        }
    }
}