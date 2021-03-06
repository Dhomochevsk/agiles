/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Menu_Principal extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    private ImageIcon imagen;
    private Icon icono;
    DefaultTableModel modelo = new DefaultTableModel();
    String user;
    
    public Menu_Principal(String id) {
        initComponents();
        user=id;
        this.setLocationRelativeTo(null);
        cargarTabla();
        cargarTablaContactos();
        this.pintarImagen(this.lblImagenLogo, "src/imagenes/Logo Aplicacion.png");
        this.pintarImagen(this.lblImagenContrac, "src/imagenes/contratacion.png");
        this.pintarImagen(this.lblImagenHist, "src/imagenes/cobertura-de-contrato.png");
        this.pintarImagen(this.lblImagenGuard, "src/imagenes/Guardar-icon.png");
    }

    public void cargarTabla(){
        try {
            String [] titulos = {"EMPLEADO","CLIENTE","ESTADO"};
            String [] registros = new String[3];
            modelo = new DefaultTableModel(null,titulos);
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            String sql = "select *from contrataciones where CED_CLI_CON=(select CED_CLI from CLIENTES where USE_CLI='"+user+"');";
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);
            while(rs.next())
            { 
                registros[0]=rs.getString("CED_EMP_CON");
                registros[1]=rs.getString("CED_CLI_CON");
               // registros[2]="PENDIENTE";

                if(rs.getBoolean("EST_CON"))
                {
                    registros[2]="Aceptado";
                } 
                else{
                    if(rs.getString("EST_CON")==null)
                    registros[2]="Pendiente";
                    else
                        registros[2]="Rechazado";
                }

                modelo.addRow(registros);
            }
            jtbl_ContratosRecientes.setModel(modelo);;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }
    
    public void cargarTablaContactos(){
        try {
            String [] titulos = {"Usuario","Descripcion"};
            String [] registros = new String[2];
            modelo = new DefaultTableModel(null,titulos);
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            String sql = "select E.USU_EMP, C.DES_CONT from CONTACTOS C, EMPLEADOS E where C.USE_CLI_CONT='"+user+"' AND E.CED_EMP =(SELECT CED_EMP_CONT FROM CONTACTOS WHERE USE_CLI_CONT='"+user+"');";
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);
            while(rs.next())
            {
                
                registros[0]=rs.getString("E.USU_EMP");
                registros[1]=rs.getString("C.DES_CONT");

          
                modelo.addRow(registros);
            }
            jtbl_Contactos.setModel(modelo);;
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }
    
    public int ultimoContacto(){

        try {
            Conexion cc=new Conexion();
            Connection cn = cc.conexion();
            String sql = "";
            sql ="SELECT MAX(ID_CONT) FROM CONTACTOS;";
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);
            int valor =  rs.getInt("ID_CONT")+1;
                return valor;
   
            
        } catch (SQLException ex) {
            return 0;
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

        bg = new javax.swing.JPanel();
        jpEncabezado = new javax.swing.JPanel();
        BookWork = new javax.swing.JLabel();
        lblImagenLogo = new javax.swing.JLabel();
        jpBarraBotones = new javax.swing.JPanel();
        btnMinim = new javax.swing.JPanel();
        Minim = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        Contrataciones_Recientes = new javax.swing.JLabel();
        bgContrataciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_ContratosRecientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Contactos_Guardados = new javax.swing.JLabel();
        bgContacG = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_Contactos = new javax.swing.JTable();
        jpNuevaContra = new javax.swing.JPanel();
        lblImagenContrac = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImagenHist = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImagenGuard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 440));
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpEncabezado.setBackground(new java.awt.Color(157, 214, 238));
        jpEncabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpEncabezadoMouseDragged(evt);
            }
        });
        jpEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpEncabezadoMousePressed(evt);
            }
        });

        BookWork.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        BookWork.setText("BookWork");

        jpBarraBotones.setPreferredSize(new java.awt.Dimension(100, 50));
        jpBarraBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinim.setBackground(new java.awt.Color(140, 146, 160));
        btnMinim.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMinim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimMouseClicked(evt);
            }
        });

        Minim.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Minim.setForeground(new java.awt.Color(255, 255, 255));
        Minim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minim.setText("_");

        javax.swing.GroupLayout btnMinimLayout = new javax.swing.GroupLayout(btnMinim);
        btnMinim.setLayout(btnMinimLayout);
        btnMinimLayout.setHorizontalGroup(
            btnMinimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Minim, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        btnMinimLayout.setVerticalGroup(
            btnMinimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Minim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jpBarraBotones.add(btnMinim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpBarraBotones.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        javax.swing.GroupLayout jpEncabezadoLayout = new javax.swing.GroupLayout(jpEncabezado);
        jpEncabezado.setLayout(jpEncabezadoLayout);
        jpEncabezadoLayout.setHorizontalGroup(
            jpEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(BookWork)
                .addGap(27, 27, 27)
                .addComponent(lblImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(jpBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpEncabezadoLayout.setVerticalGroup(
            jpEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addComponent(jpBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BookWork, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        bg.add(jpEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 130));

        Contrataciones_Recientes.setBackground(new java.awt.Color(255, 255, 255));
        Contrataciones_Recientes.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Contrataciones_Recientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contrataciones_Recientes.setText("<html> Contrataciones <br> <center>Recientes</center> </html>");
        Contrataciones_Recientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Contrataciones_RecientesMouseClicked(evt);
            }
        });
        bg.add(Contrataciones_Recientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 400, 136));

        bgContrataciones.setBackground(new java.awt.Color(217, 217, 217));
        bgContrataciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgContrataciones.setPreferredSize(new java.awt.Dimension(450, 598));
        bgContrataciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbl_ContratosRecientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbl_ContratosRecientes);

        bgContrataciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 340));

        bg.add(bgContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 360, 340));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RECARGAR");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, 40));

        Contactos_Guardados.setBackground(new java.awt.Color(255, 255, 255));
        Contactos_Guardados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Contactos_Guardados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contactos_Guardados.setText("<html> Contactos <br> <center>Guardados</center> </html>");
        bg.add(Contactos_Guardados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 280, 136));

        bgContacG.setBackground(new java.awt.Color(217, 217, 217));
        bgContacG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgContacG.setPreferredSize(new java.awt.Dimension(450, 598));
        bgContacG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbl_Contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbl_Contactos);

        bgContacG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 370));

        bg.add(bgContacG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 290, 370));

        jpNuevaContra.setBackground(new java.awt.Color(125, 140, 125));
        jpNuevaContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpNuevaContraMouseClicked(evt);
            }
        });

        lblImagenContrac.setPreferredSize(new java.awt.Dimension(145, 155));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("<html>\n<center>\nNueva\n<br>\nContrataci??n\n</center>\n</html>");

        javax.swing.GroupLayout jpNuevaContraLayout = new javax.swing.GroupLayout(jpNuevaContra);
        jpNuevaContra.setLayout(jpNuevaContraLayout);
        jpNuevaContraLayout.setHorizontalGroup(
            jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaContraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenContrac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpNuevaContraLayout.setVerticalGroup(
            jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaContraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenContrac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bg.add(jpNuevaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 190, 170));

        jPanel2.setBackground(new java.awt.Color(125, 140, 125));

        lblImagenHist.setPreferredSize(new java.awt.Dimension(145, 155));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("<html>\n<center>\nHistorial de\n<br>\nContrataciones\n</center>\n</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblImagenHist, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenHist, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 170, 160));

        lblImagenGuard.setBackground(new java.awt.Color(102, 255, 255));
        bg.add(lblImagenGuard, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpEncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEncabezadoMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpEncabezadoMousePressed

    private void jpEncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_jpEncabezadoMouseDragged

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        this.btnCerrar.setBackground(Color.WHITE);
        this.X.setForeground(Color.red);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        this.btnCerrar.setBackground(Color.RED);
        this.X.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void jpNuevaContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevaContraMouseClicked
        BD_Tabla  a = new BD_Tabla(user);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jpNuevaContraMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        cargarTabla();
        cargarTablaContactos();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void Contrataciones_RecientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contrataciones_RecientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Contrataciones_RecientesMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal("san1").setVisible(true);
            }
        });
    }
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookWork;
    private javax.swing.JLabel Contactos_Guardados;
    private javax.swing.JLabel Contrataciones_Recientes;
    private javax.swing.JLabel Minim;
    private javax.swing.JLabel X;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgContacG;
    private javax.swing.JPanel bgContrataciones;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnMinim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpBarraBotones;
    private javax.swing.JPanel jpEncabezado;
    private javax.swing.JPanel jpNuevaContra;
    private javax.swing.JTable jtbl_Contactos;
    private javax.swing.JTable jtbl_ContratosRecientes;
    private javax.swing.JLabel lblImagenContrac;
    private javax.swing.JLabel lblImagenGuard;
    private javax.swing.JLabel lblImagenHist;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}
