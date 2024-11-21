/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shonenzone.methods;

/**
 *
 * @author Lenovo
 */
public class Open {
        
    public static void showWindowAndDispose(javax.swing.JFrame currentWindow, javax.swing.JFrame newWindow) {
    if (newWindow != null) {
        // Mostrar la nueva ventana
        newWindow.setVisible(true);
    }
    if (currentWindow != null) {
        // Cerrar la ventana actual
        currentWindow.dispose();
    }
}
    
}
