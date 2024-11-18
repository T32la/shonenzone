package shonenzone.models;

/**
 *
 * @author Lenovo
 */
public class ValidateUser {
    
    private static String emailUserAll;
    
     public static void iniciarSesion(String email) {
         emailUserAll = email;
    }

    // Método para obtener el correo del usuario actual
    public static String getCorreoUsuarioActual() {
        return emailUserAll;
    }

    // Método para cerrar la sesión
    public static void cerrarSesion() {
        emailUserAll = null;
    }
}
