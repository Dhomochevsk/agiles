/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xmouse, ymouse;
    private ImageIcon imagen;
    private Icon icono;
    public Login() {
        initComponents();
        registro_transparente();
        this.pintarImagen(this.lblImagenLogo, "src/imagenes/Logo Aplicacion.png");
    }
    
    
    public void validar(){ 
         int resultado=0;
        try {
           
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            String usuario =jtxt_usuario.getText();
            String contraseña = jtxt_pass.getText();
            String sql ="SELECT * from clientes WHERE USE_CLI='"+usuario+"' AND PASS_CLI='"+contraseña+"' ;";
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);    
            if(rs.next())
                {
                    resultado=1;
                    if(resultado==1){
                    Menu_Principal pantalla = new Menu_Principal(usuario);
                    pantalla.setVisible(true);
                    this.dispose();
                    }
                }
            else{
                JOptionPane.showMessageDialog(null, "CONTRASEÑA O USUARIO INVALIDOS");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    

    public void registro_transparente(){
    jbtn_Registrarse.setOpaque(false);
    jbtn_Registrarse.setContentAreaFilled(false);
    jbtn_Registrarse.setBorderPainted(false);
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
        background = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpl_minus = new javax.swing.JPanel();
        jbl_minus = new javax.swing.JLabel();
        jpl_exit = new javax.swing.JPanel();
        jbl_exit = new javax.swing.JLabel();
        lblImagenLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtxt_usuario = new javax.swing.JTextField();
        jtxt_pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtn_Registrarse = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbl_ingresar = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BOOKWORK");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(157, 214, 238));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BookWork");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 50));

        jpl_minus.setBackground(new java.awt.Color(204, 204, 204));
        jpl_minus.setMinimumSize(new java.awt.Dimension(40, 40));

        jbl_minus.setBackground(java.awt.Color.lightGray);
        jbl_minus.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jbl_minus.setForeground(new java.awt.Color(255, 255, 255));
        jbl_minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_minus.setText("-");
        jbl_minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_minusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_minusMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpl_minusLayout = new javax.swing.GroupLayout(jpl_minus);
        jpl_minus.setLayout(jpl_minusLayout);
        jpl_minusLayout.setHorizontalGroup(
            jpl_minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jpl_minusLayout.setVerticalGroup(
            jpl_minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_minus, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel6.add(jpl_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, 40));

        jpl_exit.setBackground(java.awt.Color.red);

        jbl_exit.setBackground(new java.awt.Color(0, 255, 255));
        jbl_exit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        jbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_exit.setText("X");
        jbl_exit.setPreferredSize(new java.awt.Dimension(35, 14));
        jbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpl_exitLayout = new javax.swing.GroupLayout(jpl_exit);
        jpl_exit.setLayout(jpl_exitLayout);
        jpl_exitLayout.setHorizontalGroup(
            jpl_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpl_exitLayout.setVerticalGroup(
            jpl_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(jpl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 40));
        jPanel6.add(lblImagenLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 180, 118));

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtxt_usuario.setBackground(new java.awt.Color(240, 246, 248));
        jtxt_usuario.setForeground(java.awt.Color.lightGray);
        jtxt_usuario.setText(" Ingrese su nombre de Usuario");
        jtxt_usuario.setBorder(null);
        jtxt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxt_usuarioMousePressed(evt);
            }
        });

        jtxt_pass.setBackground(new java.awt.Color(240, 246, 248));
        jtxt_pass.setForeground(java.awt.Color.lightGray);
        jtxt_pass.setText(" *************");
        jtxt_pass.setBorder(null);
        jtxt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxt_passMousePressed(evt);
            }
        });
        jtxt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_passActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO:");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIO DE SESION");

        jbtn_Registrarse.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbtn_Registrarse.setForeground(new java.awt.Color(138, 237, 237));
        jbtn_Registrarse.setText("REGISTRARSE");
        jbtn_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_RegistrarseMouseClicked(evt);
            }
        });
        jbtn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_RegistrarseActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(157, 214, 238));

        jbl_ingresar.setBackground(new java.awt.Color(255, 255, 255));
        jbl_ingresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbl_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jbl_ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_ingresar.setText("INGRESAR");
        jbl_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jtxt_pass)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxt_pass)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 630, 310));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_passActionPerformed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseEntered
        jpl_exit.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbl_exitMouseEntered

    private void jbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jbl_exitMouseClicked

    private void jbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseExited
        jpl_exit.setBackground(Color.RED);
    }//GEN-LAST:event_jbl_exitMouseExited

    private void jbl_minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseEntered
        jpl_minus.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbl_minusMouseEntered

    private void jbl_minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseExited
         jpl_minus.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbl_minusMouseExited

    private void jbl_minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseClicked
        this.setExtendedState(ICONIFIED);
        jpl_minus.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbl_minusMouseClicked

    private void jtxt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_usuarioMousePressed
        
        if(jtxt_usuario.getText().equalsIgnoreCase(" Ingrese su nombre de Usuario") || jtxt_usuario.getText().equalsIgnoreCase(""))
        {
        jtxt_usuario.setText("");
        jtxt_usuario.setForeground(Color.BLACK);
        }
        if(jtxt_pass.getText().equalsIgnoreCase(""))
        {
        jtxt_pass.setText(" *************");
        jtxt_pass.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_jtxt_usuarioMousePressed

    private void jtxt_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_passMousePressed
        if(jtxt_pass.getText().equalsIgnoreCase(" *************") || jtxt_pass.getText().equalsIgnoreCase(""))
        {
        jtxt_pass.setText("");
        jtxt_pass.setForeground(Color.BLACK);
        }
        if(jtxt_usuario.getText().equalsIgnoreCase(""))
        {
        jtxt_usuario.setForeground(Color.LIGHT_GRAY);
        jtxt_usuario.setText(" Ingrese su nombre de Usuario");
        }
    }//GEN-LAST:event_jtxt_passMousePressed

    private void jbl_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_ingresarMouseClicked
        validar();
        //Menu_Principal a = new Menu_Principal();
        //a.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jbl_ingresarMouseClicked

    private void jbtn_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_RegistrarseMouseClicked
        Registro formulario = new Registro();
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_RegistrarseMouseClicked

    private void jbtn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_RegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_RegistrarseActionPerformed
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jbl_exit;
    private javax.swing.JLabel jbl_ingresar;
    private javax.swing.JLabel jbl_minus;
    private javax.swing.JButton jbtn_Registrarse;
    private javax.swing.JPanel jpl_exit;
    private javax.swing.JPanel jpl_minus;
    private javax.swing.JTextField jtxt_pass;
    private javax.swing.JTextField jtxt_usuario;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}
