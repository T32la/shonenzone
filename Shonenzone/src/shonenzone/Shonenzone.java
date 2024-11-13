/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shonenzone;

import shonenzone.vista.Login;

import shonenzone.vista.Registro;
/**
 *
 * @author Lenovo
 */
public class Shonenzone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Login home = new Login();
//        Registro registro = new Registro();
//        registro.setVisible(true);
        home.setVisible(true);
        Registro registro = new Registro();
        registro.setVisible(true);
       // home.setVisible(true);
        System.out.println("Si, compila");
        
    }
    
}
