/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Contacto extends javax.swing.JFrame {

    /**
     * Creates new form Contacto
     */
    int xmouse, ymouse;
    String c_ced, c_nom,c_ape,c_mai,c_tel,c_usu,c_pas;
    public Contacto(String cedula,String nombre,String apellido,String mail,String telefono,String usuario,String password) {
        initComponents();
        this.setLocationRelativeTo(null);
        c_ced=cedula;
        c_nom=nombre;
        c_ape=apellido;
        c_mai=mail;
        c_tel=telefono;
        c_usu=usuario;
        c_pas=password;
    }


    private void crearUsuario(String ced,String nom,String ape,String mai,String tel,String usu,String pas) {
        
        try {
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            String sql="insert into clientes(CED_CLI,NOM_CLI,APE_CLI,EMAIL_CLI,TEL_CLI,USE_CLI,PASS_CLI) values(?,?,?,?,?,?,?)";
            PreparedStatement psd = cn.prepareStatement(sql);
            
            psd.setString(1, ced);
            psd.setString(2, nom);
            psd.setString(3, ape);
            psd.setString(4, mai);
            psd.setString(5, tel);
            psd.setString(6, usu);
            psd.setString(7, pas);
            
            int n =psd.executeUpdate();
            if(n>0)
            {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            }
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"El usuario o la cedula ya estan registrados");
        }
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpl_Aceptar = new javax.swing.JPanel();
        jbl_Aceptar = new javax.swing.JLabel();
        jpl_Cancel = new javax.swing.JPanel();
        jbl_Cancel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel1.setText("<html><center>Al registrarse, los administradores de bookWork "
            + "se deslindan de cualquier problema causado por "
            + "malas contrataciones, o posibles problemas que "
            + "puedan existir entre empleado y empleador.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, 100));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel2.setText("<html><center>BookWork solo se responsabiliza por defectos o fallas en el sistema que puedan afectar el proceso de contrataci??n, hasta la finalizacion del mismo. As?? como la perdida de datos o la filtracion de informacion delicada, que puede afectar su integridad o su experiencia en la aplicacion.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 330, 80));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel3.setText("Si desea mas informacion dirijase a: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("www.bookwork.com");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 190, 40));

        jpl_Aceptar.setBackground(new java.awt.Color(157, 214, 238));

        jbl_Aceptar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jbl_Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        jbl_Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_Aceptar.setText("ACEPTAR");
        jbl_Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_AceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpl_AceptarLayout = new javax.swing.GroupLayout(jpl_Aceptar);
        jpl_Aceptar.setLayout(jpl_AceptarLayout);
        jpl_AceptarLayout.setHorizontalGroup(
            jpl_AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jpl_AceptarLayout.setVerticalGroup(
            jpl_AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jpl_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 40));

        jpl_Cancel.setBackground(new java.awt.Color(157, 214, 238));

        jbl_Cancel.setBackground(new java.awt.Color(157, 214, 238));
        jbl_Cancel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jbl_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jbl_Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_Cancel.setText("CANCELAR");
        jbl_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_CancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpl_CancelLayout = new javax.swing.GroupLayout(jpl_Cancel);
        jpl_Cancel.setLayout(jpl_CancelLayout);
        jpl_CancelLayout.setHorizontalGroup(
            jpl_CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jpl_CancelLayout.setVerticalGroup(
            jpl_CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jpl_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

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

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BOOKWORK");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jbl_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_CancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jbl_CancelMouseClicked

    private void jbl_AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_AceptarMouseClicked
        crearUsuario(c_ced, c_nom,c_ape,c_mai,c_tel,c_usu,c_pas);
        Menu_Principal a = new Menu_Principal(c_usu);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbl_AceptarMouseClicked

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
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto("","","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jbl_Aceptar;
    private javax.swing.JLabel jbl_Cancel;
    private javax.swing.JPanel jpl_Aceptar;
    private javax.swing.JPanel jpl_Cancel;
    // End of variables declaration//GEN-END:variables
}
