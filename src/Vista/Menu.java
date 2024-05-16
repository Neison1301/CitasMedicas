package Vista;

import Clases.Ndoctor;

public class Menu extends javax.swing.JFrame {

    Ndoctor ndoctor = new Ndoctor(new int[100], new String[100], new String[100], new String[100], new String[100], new boolean[100], new String[100]);

    public Menu() {
        initComponents();

        ndoctor.actualizarCantidadDoctores(lblDoctores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menu2 = new Label.Menu();
        menu3 = new Label.Menu();
        menu8 = new Label.Menu();
        menu4 = new Label.Menu();
        jLabel7 = new javax.swing.JLabel();
        menu14 = new Label.Menu();
        menu16 = new Label.Menu();
        menu17 = new Label.Menu();
        menu18 = new Label.Menu();
        lblDoctores = new javax.swing.JLabel();
        lblRegistrarDoctor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(0, 83, 118));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        menu1.add(jLabel2);
        jLabel2.setBounds(30, 110, 70, 20);
        menu1.add(jSeparator1);
        jSeparator1.setBounds(10, 130, 100, 10);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    HORARIO");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.add(jLabel1);
        jLabel1.setBounds(0, 280, 110, 60);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  DOCTORES");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.add(jLabel5);
        jLabel5.setBounds(0, 340, 110, 60);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  PACIENTES");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        menu1.add(jLabel6);
        jLabel6.setBounds(0, 220, 110, 60);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("       CITAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.add(jLabel10);
        jLabel10.setBounds(0, 160, 110, 60);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Cerrar Sesion");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        menu1.add(jLabel4);
        jLabel4.setBounds(0, 450, 110, 30);

        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 500));

        menu2.setBackground(new java.awt.Color(55, 215, 255));
        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 380, 130));

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 250, 260));

        menu8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(menu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 180, 90));

        menu4.setBackground(new java.awt.Color(55, 215, 255));
        jPanel1.add(menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 190, 130));

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel7.setText("BIENVENIDO DE VUELTA ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 300, 30));

        menu14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(menu14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 250, 160));

        menu16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(menu16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 180, 90));

        menu17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(menu17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 170, 60));

        menu18.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctores.setBackground(new java.awt.Color(255, 255, 255));
        lblDoctores.setToolTipText("");
        menu18.add(lblDoctores);
        lblDoctores.setBounds(10, 20, 30, 30);

        lblRegistrarDoctor.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lblRegistrarDoctor.setText("                RegistrarDoctor");
        lblRegistrarDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarDoctorMouseClicked(evt);
            }
        });
        menu18.add(lblRegistrarDoctor);
        lblRegistrarDoctor.setBounds(0, 0, 160, 60);

        jPanel1.add(menu18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void actualizarCantidadDoctores(String cantidad) {
        lblDoctores.setText(cantidad);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        Pacientes pacientes = new Pacientes();

        pacientes.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        IniciarSesion inciarSesion = new IniciarSesion();

        inciarSesion.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jLabel4MouseClicked

    private void lblRegistrarDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarDoctorMouseClicked
        RegistrarDoctor registrarDoctor = new RegistrarDoctor();

        registrarDoctor.setVisible(true);

        this.dispose();    }//GEN-LAST:event_lblRegistrarDoctorMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblRegistrarDoctor;
    private Label.Menu menu1;
    private Label.Menu menu14;
    private Label.Menu menu16;
    private Label.Menu menu17;
    private Label.Menu menu18;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private Label.Menu menu4;
    private Label.Menu menu8;
    // End of variables declaration//GEN-END:variables
}
