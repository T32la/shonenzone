/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shonenzone.views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import shonenzone.models.User;
import shonenzone.models.ValidateUser;

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Login() {
        initComponents();
    }

//    private boolean validarCredenciales(String mail, String password) {
//        // Carpeta donde se almacena los datos
//        File carpetaUsuario = new File(".data");
//        
//        // Verificar que existe la carpeta
//        if(!carpetaUsuario.exists() || !carpetaUsuario.isDirectory()) {
//            JOptionPane.showMessageDialog(this, "Error...", "Error...", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        
//        // Verificar Archivo
//        String emn = mail.trim().toLowerCase();
//        File archivoUsuario = new File(carpetaUsuario, emn);
//        
//        // Verificar si existe el archivos
//        if (!archivoUsuario.exists()) {
//            JOptionPane.showMessageDialog(this, "El correo si existe");
//        }
//        
//        try (BufferedReader reader = new BufferedReader(new FileReader(archivoUsuario))) {
//            String linea;
//            String passwordArchivo = "";
//            
//            
//            while ((linea = reader.readLine()) != null) {
//                if (linea.startsWith("Contrasena: ")) {
//                    passwordArchivo = linea.split(":")[1].trim();
//                }
//            }
//            
//            if (password.equals(passwordArchivo)) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//    }
 
    private boolean validarCredenciales(String mail, String password) {
        // Carpeta donde se almacenan los datos de los usuarios
        File carpetaUsuario = new File("data");

        // Verificar si existe la carpeta, si no, crearla
        if (!carpetaUsuario.exists()) {
            if (!carpetaUsuario.mkdir()) {
                JOptionPane.showMessageDialog(null, "Error al crear la carpeta de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        // Archivo donde se almacenan los datos de los usuarios
        File archivoDatos = new File(carpetaUsuario, "db.txt");

        // Verificar si el archivo existe, si no, crearlo
        if (!archivoDatos.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo de datos no existe. Creando uno nuevo...", "Archivo no encontrado", JOptionPane.INFORMATION_MESSAGE);
            try {
                if (archivoDatos.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "El archivo data.txt ha sido creado. Por favor, registre un usuario.", "Archivo Creado", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return false; // Archivo creado, el usuario debe registrar credenciales
        }

        // Leer y validar las credenciales
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoDatos))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                // Separar los datos de correo y contraseña
                if (linea.startsWith("Correo: ")) {
                    String[] partes = linea.split(",");
                    if (partes.length == 2) {
                        String correoArchivo = partes[1].split(":")[1].trim();
                        String passwordArchivo = partes[2].split(":")[1].trim();

                        // Validar correo y contraseña
                        if (correoArchivo.equals(mail) && passwordArchivo.equals(password)) {
                            return true; // Credenciales válidas
                        }
                    }
                }
            }

            // Si llegamos aquí, las credenciales no coinciden
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modi
     * fy this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lgemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lgingresar = new javax.swing.JButton();
        lgpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        see = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(46, 195, 213));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Correo electronico");

        lgemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgemailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Contraseña");

        lgingresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lgingresar.setText("Ingresar");
        lgingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgingresarMouseClicked(evt);
            }
        });

        lgpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgpasswordActionPerformed(evt);
            }
        });

        jLabel5.setText("¿No tienes una cuenta? ");

        jButton2.setBackground(new java.awt.Color(232, 226, 226));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Registrate");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/source/img/User Male.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/source/img/Key.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/logo.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel8.setText("INICIO DE SESIÓN");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/Dem.PNG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/ju.PNG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/to.PNG"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/one.PNG"))); // NOI18N

        see.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/source/img/Eye.png"))); // NOI18N
        see.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        see.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeMouseClicked(evt);
            }
        });
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lgemail, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lgpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(see)))
                                .addGap(401, 401, 401))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(373, 373, 373)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(548, 548, 548)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lgingresar)
                                .addGap(346, 346, 346)))
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lgemail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(see)
                                    .addComponent(lgpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(lgingresar)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lgemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgemailActionPerformed

    private void lgpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgpasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // abre el formulario de registro, si el usuario no tiene cuenta.
        Registro rg = new Registro();
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void lgingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgingresarMouseClicked
        // TODO add your handling code here
        String email = this.lgemail.getText();
        String password = this.lgpassword.getText();
        

        
        // Verifica si existe la carpeta o crea la carpeta
        
        if (email.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar credenciales desde la carpeta de usuarios
        if (validarCredenciales(email, password)) {
            // Guardar el correo del usuario actual en la sesión
            emailUserAll.iniciarSesion(email);

            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");

            // Abrir la página principal
                Home ingresar = new Home();
                ingresar.setVisible(true);
                ingresar.pack();
                ingresar.setLocationRelativeTo(null);
                this.dispose();
//                Home home = new Home();
//                ingresar.setVisible(true); 
                
            this.dispose(); // Cerrar la ventana actual
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        

        
    }//GEN-LAST:event_lgingresarMouseClicked

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seeActionPerformed

    private void seeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_seeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField lgemail;
    private javax.swing.JButton lgingresar;
    private javax.swing.JTextField lgpassword;
    private javax.swing.JButton see;
    // End of variables declaration//GEN-END:variables
}
