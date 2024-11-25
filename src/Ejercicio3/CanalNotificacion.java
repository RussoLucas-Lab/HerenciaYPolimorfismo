package Ejercicio3;

abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();

    @Override
    public String toString() {
        return "Usuario: " + usuario + " | Mensaje: " + mensaje;
    }
}