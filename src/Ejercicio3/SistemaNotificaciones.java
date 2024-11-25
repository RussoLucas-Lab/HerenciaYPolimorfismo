package Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones(5);

        CanalNotificacion correo = new CorreoElectronic("Lucas", "¡Bienvenido a nuestra app!", "lucas@gmail.com");
        CanalNotificacion mensaje = new MensajeTexto("Lucas", "Tu código de verificación es 1234", "+5491112345678");

        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensaje);

        System.out.println("Canales de Notificación:");
        notificaciones.mostrarCanales();

        System.out.println("\nPersonalizando mensajes...");
        notificaciones.personalizarMensajes("¡Actualización importante! Revisa nuestra app.");

        System.out.println("\nCanales de Notificación después de personalizar:");
        notificaciones.mostrarCanales();


        System.out.println("\nEnviando notificaciones:");
        notificaciones.enviarNotificaciones();
    }
}