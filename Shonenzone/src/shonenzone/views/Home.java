package shonenzone.views;

import javax.swing.*;

/**
 * Clase principal para la interfaz gráfica de Shonen Zone
 */
public class Home extends javax.swing.JFrame {

    /**
     * Constructor de la clase Home
     */
    public Home() {
        initComponents();
    }

    /**
     * Método generado automáticamente para inicializar componentes
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jComboBoxUsuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonDeadNote = new javax.swing.JButton();
        jButtonDemonSlayer = new javax.swing.JButton();
        jButtonNaruto = new javax.swing.JButton();
        jButtonJujutsuKaisen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shonen Zone");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("SHONEN ZONE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Vive un viaje a través de tu manga favorito");

        jButtonMenu.setText("Menú");
        jButtonMenu.addActionListener(evt -> showMenu());

        txtBusqueda.addActionListener(evt -> onSearchInput(evt));

        salir.setText("Salir");
        salir.addActionListener(evt -> System.exit(0));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(evt -> searchAction());

        jComboBoxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Usuario1", "Usuario2", "Usuario3"}));

        // Configuración de etiquetas y botones con imágenes
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/note.png")));
        jLabel5.setText("Suspenso Sobrenatural");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/demon.jpg")));
        jLabel9.setText("Acción y Sobrenatural");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/naruto.jpg")));
        jLabel12.setText("Acción y Fantasía");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shonenzone/views/juju.jpg")));
        jLabel14.setText("Fantasía Oscura");

        jButtonDeadNote.setText("DEAD NOTE");
        jButtonDeadNote.addActionListener(evt -> showMangaInfo("Dead Note"));

        jButtonDemonSlayer.setText("DEMON SLAYER");
        jButtonDemonSlayer.addActionListener(evt -> showMangaInfo("Demon Slayer"));

        jButtonNaruto.setText("NARUTO");
        jButtonNaruto.addActionListener(evt -> showMangaInfo("Naruto"));

        jButtonJujutsuKaisen.setText("JUJUTSU KAISEN");
        jButtonJujutsuKaisen.addActionListener(evt -> showMangaInfo("Jujutsu Kaisen"));

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMenu)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(salir))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jButtonDeadNote)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jButtonDemonSlayer)
                                                        .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jButtonNaruto)
                                                        .addComponent(jLabel12))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jButtonJujutsuKaisen)
                                                        .addComponent(jLabel14))))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                        .addComponent(jButtonMenu)
                                        .addComponent(salir))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonDeadNote)
                                        .addComponent(jButtonDemonSlayer)
                                        .addComponent(jButtonNaruto)
                                        .addComponent(jButtonJujutsuKaisen))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Muestra información del manga seleccionado
     */
    private void showMangaInfo(String manga) {
        JOptionPane.showMessageDialog(this, "Información de " + manga);
    }

    /**
     * Acción para búsqueda
     */
    private void searchAction() {
        String query = txtBusqueda.getText();
        JOptionPane.showMessageDialog(this, "Buscando: " + query);
    }

    /**
     * Método para manejar acciones en el menú
     */
    private void showMenu() {
        JOptionPane.showMessageDialog(this, "Menú principal");
    }

    private void onSearchInput(java.awt.event.ActionEvent evt) {
        // Placeholder para acciones en la caja de búsqueda
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaradas
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> jComboBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonDeadNote;
    private javax.swing.JButton jButtonDemonSlayer;
    private javax.swing.JButton jButtonNaruto;
    private javax.swing.JButton jButtonJujutsuKaisen;
}
