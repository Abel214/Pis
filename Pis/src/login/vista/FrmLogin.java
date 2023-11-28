package login.vista;

import java.awt.Dimension;

/**
 *
 * @author Alexander
 */
public class FrmLogin extends javax.swing.JFrame {
    
    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - Sistema - Eva - PIS");
        this.setSize(new Dimension(700, 500));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton_IniciarSesion = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universidad Nacional de Loja");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 330, 340, 22);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 170, 0, 0);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(440, 0, 160, 210);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("GRUPO 2 - PIS - MODULO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 330, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/vista/img/carrito1.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 110, 170, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 500);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/vista/img/user1.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 10, 170, 190);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/vista/img/user2.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 200, 90, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/vista/img/password.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 250, 70, 40);

        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_usuario);
        txt_usuario.setBounds(110, 210, 210, 30);

        txt_password.setText("jPasswordField1");
        jPanel2.add(txt_password);
        txt_password.setBounds(110, 262, 210, 30);

        jButton_IniciarSesion.setBackground(new java.awt.Color(61, 153, 255));
        jButton_IniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_IniciarSesion.setText("Iniciar Sesión");
        jButton_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_IniciarSesion);
        jButton_IniciarSesion.setBounds(120, 340, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(350, 0, 360, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_IniciarSesionActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}