/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import javax.swing.JTextField;


/**
 *
 * @author Admin
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    int xmouse, ymouse;
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void limpiarTexto(JTextField llave, String identificador){

        if((jtxt_Nombre.getText().equalsIgnoreCase("Ingresar Nombre") || jtxt_Nombre.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("A"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_Apellido.getText().equalsIgnoreCase("Ingresar Apellido") || jtxt_Apellido.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("B"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_Email.getText().equalsIgnoreCase("Ingresar email") || jtxt_Email.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("C"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_Telefono.getText().equalsIgnoreCase("Ingresar Telefono") || jtxt_Telefono.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("D"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_Usuario.getText().equalsIgnoreCase("Ingresar Usuario") || jtxt_Usuario.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("E"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_Pass.getText().equalsIgnoreCase("Ingresar Contraseña") || jtxt_Pass.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("F"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
        if((jtxt_ConfPass.getText().equalsIgnoreCase("Ingresar Contraseña") || jtxt_ConfPass.getText().equalsIgnoreCase("")) && identificador.equalsIgnoreCase("G"))
        {
        llave.setText("");
        llave.setForeground(Color.BLACK);
        }
    }
    
    public void contenidoTexto(String exclusor)
    {
        if(jtxt_Nombre.getText().equalsIgnoreCase("") && exclusor!="A")
        {
        jtxt_Nombre.setText("Ingresar Nombre");
        jtxt_Nombre.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_Apellido.getText().equalsIgnoreCase("") && exclusor!="B")
        {
        jtxt_Apellido.setText("Ingresar Apellido");
        jtxt_Apellido.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_Email.getText().equalsIgnoreCase("") && exclusor!="C")
        {
        jtxt_Email.setText("Ingresar email");
        jtxt_Email.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_Telefono.getText().equalsIgnoreCase("") && exclusor!="D")
        {
        jtxt_Telefono.setText("Ingresar Telefono");
        jtxt_Telefono.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_Usuario.getText().equalsIgnoreCase("") && exclusor!="E")
        {
        jtxt_Usuario.setText("Ingresar Usuario");
        jtxt_Usuario.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_Pass.getText().equalsIgnoreCase("") && exclusor!="F")
        {
        jtxt_Pass.setText("Ingresar Contraseña");
        jtxt_Pass.setForeground(Color.LIGHT_GRAY);
        }
        if(jtxt_ConfPass.getText().equalsIgnoreCase("") && exclusor!="G")
        {
        jtxt_ConfPass.setText("Ingresar Contraseña");
        jtxt_ConfPass.setForeground(Color.LIGHT_GRAY);
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

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtxt_Nombre = new javax.swing.JTextField();
        jtxt_Apellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtxt_Email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jtxt_Telefono = new javax.swing.JTextField();
        jtxt_Usuario = new javax.swing.JTextField();
        jtxt_Pass = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jtxt_ConfPass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jpl_minus = new javax.swing.JPanel();
        jbl_minus = new javax.swing.JLabel();
        jpl_exit = new javax.swing.JPanel();
        jbl_exit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(138, 237, 237));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jPanel3.setBackground(new java.awt.Color(138, 237, 237));
        jPanel3.setPreferredSize(new java.awt.Dimension(105, 23));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACEPTAR");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 151, 41));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, 10));

        jtxt_Nombre.setForeground(java.awt.Color.lightGray);
        jtxt_Nombre.setText("Ingresar Nombre");
        jtxt_Nombre.setBorder(null);
        jtxt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_NombreMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 151, 31));

        jtxt_Apellido.setForeground(java.awt.Color.lightGray);
        jtxt_Apellido.setText("Ingresar Apellido");
        jtxt_Apellido.setBorder(null);
        jtxt_Apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_ApellidoMouseClicked(evt);
            }
        });
        jtxt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 10));

        jtxt_Email.setForeground(java.awt.Color.lightGray);
        jtxt_Email.setText("Ingresar email");
        jtxt_Email.setBorder(null);
        jtxt_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_EmailMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 10));

        jtxt_Telefono.setForeground(java.awt.Color.lightGray);
        jtxt_Telefono.setText("Ingresar Telefono");
        jtxt_Telefono.setBorder(null);
        jtxt_Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_TelefonoMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, 30));

        jtxt_Usuario.setForeground(java.awt.Color.lightGray);
        jtxt_Usuario.setText("Ingresar Usuario");
        jtxt_Usuario.setBorder(null);
        jtxt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_UsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 150, 30));

        jtxt_Pass.setForeground(java.awt.Color.lightGray);
        jtxt_Pass.setText("Ingresar Contraseña");
        jtxt_Pass.setBorder(null);
        jtxt_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_PassMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 150, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 150, 10));

        jtxt_ConfPass.setForeground(java.awt.Color.lightGray);
        jtxt_ConfPass.setText("Ingresar Contraseña");
        jtxt_ConfPass.setBorder(null);
        jtxt_ConfPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_ConfPassMouseClicked(evt);
            }
        });
        jPanel1.add(jtxt_ConfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 150, 30));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        jLabel4.setText("E-mail:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 30));

        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 30));

        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 120, 30));

        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, 30));

        jLabel8.setText("Confirmar Constraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 120, 30));

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

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BOOKWORK");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 150, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_ApellidoActionPerformed

    private void jbl_minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseClicked
        this.setExtendedState(ICONIFIED);
        jpl_minus.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbl_minusMouseClicked

    private void jbl_minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseEntered
        jpl_minus.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbl_minusMouseEntered

    private void jbl_minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_minusMouseExited
        jpl_minus.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbl_minusMouseExited

    private void jbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbl_exitMouseClicked

    private void jbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseEntered
        jpl_exit.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbl_exitMouseEntered

    private void jbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_exitMouseExited
        jpl_exit.setBackground(Color.RED);
    }//GEN-LAST:event_jbl_exitMouseExited

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Contacto a = new Contacto();
        a.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jtxt_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_NombreMouseClicked
        limpiarTexto(jtxt_Nombre,"A");
        contenidoTexto("A");
    }//GEN-LAST:event_jtxt_NombreMouseClicked

    private void jtxt_ApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_ApellidoMouseClicked
        limpiarTexto(jtxt_Apellido,"B");
        contenidoTexto("B");
    }//GEN-LAST:event_jtxt_ApellidoMouseClicked

    private void jtxt_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_EmailMouseClicked
        limpiarTexto(jtxt_Email,"C");
        contenidoTexto("C");
    }//GEN-LAST:event_jtxt_EmailMouseClicked

    private void jtxt_TelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_TelefonoMouseClicked
        limpiarTexto(jtxt_Telefono,"D");
        contenidoTexto("D");
    }//GEN-LAST:event_jtxt_TelefonoMouseClicked

    private void jtxt_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_UsuarioMouseClicked
        limpiarTexto(jtxt_Usuario,"E");
        contenidoTexto("E");
    }//GEN-LAST:event_jtxt_UsuarioMouseClicked

    private void jtxt_PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_PassMouseClicked
        limpiarTexto(jtxt_Pass,"F");
        contenidoTexto("F");
    }//GEN-LAST:event_jtxt_PassMouseClicked

    private void jtxt_ConfPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_ConfPassMouseClicked
        limpiarTexto(jtxt_ConfPass,"G");
        contenidoTexto("G");
    }//GEN-LAST:event_jtxt_ConfPassMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jbl_exit;
    private javax.swing.JLabel jbl_minus;
    private javax.swing.JPanel jpl_exit;
    private javax.swing.JPanel jpl_minus;
    private javax.swing.JTextField jtxt_Apellido;
    private javax.swing.JTextField jtxt_ConfPass;
    private javax.swing.JTextField jtxt_Email;
    private javax.swing.JTextField jtxt_Nombre;
    private javax.swing.JTextField jtxt_Pass;
    private javax.swing.JTextField jtxt_Telefono;
    private javax.swing.JTextField jtxt_Usuario;
    // End of variables declaration//GEN-END:variables
}
