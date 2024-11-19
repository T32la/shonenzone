/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shonenzone.methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class LoginValidator {
     /**
     * Valida el login de un usuario verificando la existencia del archivo, el directorio,
     * y las credenciales.
     * 
     * @param filePath Ruta al archivo que contiene los datos de usuarios
     * @param email    Correo del usuario
     * @param password Contraseña del usuario
     * @return Mensaje indicando el resultado de la validación
     */
    public static String validate(String filePath, String email, String password) {
        try {
            // Validar la existencia del archivo y directorio
            validateFileAndDirectory(filePath);

            // Validar credenciales
            if (validateLogin(filePath, email, password)) {
                return "¡Inicio de sesión exitoso!";
            } else {
                return "Correo o contraseña incorrectos.";
            }
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }

    /**
     * Verifica la existencia del archivo y su directorio.
     * 
     * @param filePath Ruta al archivo que contiene los datos de usuarios
     * @throws IOException Si no se encuentra el archivo o el directorio
     */
    private static void validateFileAndDirectory(String filePath) throws IOException {
        File file = new File(filePath);
        File directory = file.getParentFile();

        if (!directory.exists()) {
            throw new IOException("El directorio '" + directory.getPath() + "' no existe. Verifique la configuración.");
        }

        if (!file.exists()) {
            throw new IOException("El archivo '" + file.getName() + "' no existe en el directorio '" + directory.getPath() + "'.");
        }
    }

    /**
     * Valida las credenciales del usuario leyendo el archivo.
     * 
     * @param filePath Ruta al archivo que contiene los datos de usuarios
     * @param email    Correo del usuario
     * @param password Contraseña del usuario
     * @return true si las credenciales coinciden, false en caso contrario
     * @throws IOException Si ocurre un error al leer el archivo
     */
    private static boolean validateLogin(String filePath, String email, String password) throws IOException {
        File file = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String storedEmail = null;
            String storedPassword = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Email:")) {
                    storedEmail = line.substring(6).trim();
                } else if (line.startsWith("Password:")) {
                    storedPassword = line.substring(9).trim();
                }

                if (storedEmail != null && storedPassword != null) {
                    if (storedEmail.equals(email) && storedPassword.equals(password)) {
                        return true;
                    }
                    storedEmail = null;
                    storedPassword = null;
                }
            }
        }

        return false;
    }
}
