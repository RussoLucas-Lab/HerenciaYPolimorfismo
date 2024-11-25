package Ejercicio3;

class CorreoElectronic extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronic(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo a " + direccionCorreo + " para " + usuario + ": " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Correo Electrónico | Dirección: " + direccionCorreo;
    }
}