/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import escitorio.Info_Prof;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
/**
 *
 * @author USUARIO
 */
public class BD_Tabla extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    String user;
    private ImageIcon imagen;
    private Icon icono;
    private DefaultTableModel tblModel;
    private Info_Prof frameInfo_Prof;
    private Resenas frameResenas;
    private Contratar frameContratar;
    
    public BD_Tabla(String user) {
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.lblImagenLogo, "src/imagenes/Logo Aplicacion.png");
        this.cargar();
        //(String) modelo.getValueAt(frame.getJtblEmpleadosBD().getSelectedRow(), 0);
        //ced = (String) tblModel.getValueAt(this.jtblEmpleadosBD.getSelectedRow(), 0);
    }

    
    public void diseno(){
        String[] columnas = {"Cedula","Nombre","Profesion","Cant. Contratos","Calificacion","Informacion Academica","Resenas"," "};
        tblModel = new DefaultTableModel(null,columnas){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        this.jtblEmpleadosBD.setModel(tblModel);
        this.jtblEmpleadosBD.setRowHeight(40);
    }
    
    public void cargar(){
        this.diseno();
        Object[] registros = new Object[40];
        String sql = "SELECT * FROM empleados";
        String sql2 = "SELECT DES_HAB FROM habilidades WHERE CED_EMP_HAB =";
        String sql3 = "SELECT COUNT(CED_EMP_CON) FROM CONTRATACIONES WHERE CED_EMP_CON=";
        String sql4 = "SELECT AVG(PUNT_CON) FROM CONTRATACIONES WHERE CED_EMP_CON =";
        JButton btnInfoAcad = new JButton("...");
        btnInfoAcad.setName("infoA");
        JButton btnResenas = new JButton("...");
        btnResenas.setName("Resena");
        JButton btnContacto = new JButton("Contacto");
        btnContacto.setName("Contacto");
        Conexion cc = new Conexion();
        Connection cn = cc.localhost("proy_final");
        this.jtblEmpleadosBD.setDefaultRenderer(Object.class, new RenderTable());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate fechaNac = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0] = rs.getString("EMP_CEDULA");
                registros[1] = rs.getString("EMP_NOMBRE") +" "+rs.getString("EMP_APELLIDO");
//                fechaNac = LocalDate.parse(rs.getString("EMP_FEC_NAC"), formatter);
//                Period edad = Period.between(fechaNac, LocalDate.now());
//                registros[2] = String.valueOf(edad.getYears());
                Statement st2 = cn.createStatement();
                ResultSet rs2 = st2.executeQuery(sql2+registros[0]);
                while(rs2.next()){
                registros[2] = rs2.getString("DES_HAB");
                }
                Statement st3 = cn.createStatement();
                ResultSet rs3 = st3.executeQuery(sql3+registros[0]);
                while(rs3.next()){
                registros[3] = rs3.getInt("COUNT(CED_EMP_CON)");
                }
                Statement st4 = cn.createStatement();
                ResultSet rs4 = st4.executeQuery(sql4+registros[0]);
                while(rs4.next()){
                    if ((int)registros[3] == 0) {
                        registros[4] = "Ninguna";
                    } else {
                        registros[4] = rs4.getFloat("AVG(PUNT_CON)");
                    }
                }
                registros[5] = btnInfoAcad;
                registros[6] = btnResenas;
                registros[7] = btnContacto;
                tblModel.addRow(registros);
            }
            
            this.jtblEmpleadosBD.setModel(tblModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    public void buscar(){
        this.diseno();
        Object[] registros = new Object[40];
        String sql = "SELECT * FROM empleados WHERE emp_cedula IN (SELECT CED_EMP_HAB FROM habilidades WHERE DES_HAB = '"+this.jcbProfesion.getSelectedItem().toString()+"')";
        String sql2 = "SELECT DES_HAB FROM habilidades WHERE CED_EMP_HAB =";
        String sql3 = "SELECT COUNT(CED_EMP_CON) FROM CONTRATACIONES WHERE CED_EMP_CON=";
        String sql4 = "SELECT AVG(PUNT_CON) FROM CONTRATACIONES WHERE CED_EMP_CON =";
        JButton btnInfoAcad = new JButton("...");
        btnInfoAcad.setName("infoA");
        JButton btnResenas = new JButton("...");
        btnResenas.setName("Resena");
        JButton btnContacto = new JButton("Contacto");
        btnContacto.setName("Contacto");
        Conexion cc = new Conexion();
        Connection cn = cc.localhost("proy_final");
        this.jtblEmpleadosBD.setDefaultRenderer(Object.class, new RenderTable());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate fechaNac = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0] = rs.getString("EMP_CEDULA");
                registros[1] = rs.getString("EMP_NOMBRE") +" "+rs.getString("EMP_APELLIDO");
//                fechaNac = LocalDate.parse(rs.getString("EMP_FEC_NAC"), formatter);
//                Period edad = Period.between(fechaNac, LocalDate.now());
//                registros[2] = String.valueOf(edad.getYears());
                Statement st2 = cn.createStatement();
                ResultSet rs2 = st2.executeQuery(sql2+registros[0]);
                while(rs2.next()){
                registros[2] = rs2.getString("DES_HAB");
                }
                Statement st3 = cn.createStatement();
                ResultSet rs3 = st3.executeQuery(sql3+registros[0]);
                while(rs3.next()){
                registros[3] = rs3.getInt("COUNT(CED_EMP_CON)");
                }
                Statement st4 = cn.createStatement();
                ResultSet rs4 = st4.executeQuery(sql4+registros[0]);
                while(rs4.next()){
                    if ((int)registros[3] == 0) {
                        registros[4] = "Ninguna";
                    } else {
                        registros[4] = rs4.getFloat("AVG(PUNT_CON)");
                    }
                }
                registros[5] = btnInfoAcad;
                registros[6] = btnResenas;
                registros[7] = btnContacto;
                tblModel.addRow(registros);
            }
            this.jtblEmpleadosBD.setModel(tblModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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
        jLabel2 = new javax.swing.JLabel();
        jcbProfesion = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEmpleadosBD = new javax.swing.JTable();
        jbtnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 776, Short.MAX_VALUE)
                .addComponent(jpBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpEncabezadoLayout.setVerticalGroup(
            jpEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BookWork, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jpEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 130));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Profesion");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jcbProfesion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "<html><h3 style=\"color:red\">Trabajos Manuales</h3>Plomero</html>", "Albañil", "Electricista", "Carpintero", "Panadero", "Mecánico", "Cocinero", "<html><h3 style=\"color:orange\">Trabajos Profesionales</h3>Ingeniero Civil</html>", "Arquitecto", "Contador", "Doctor", "Abogado", "Ing. en Sistemas", "Psicologo", "<html><h3 style=\"color:green\">Trabajos Tecnologicos</h3>Programador</html>", "Soporte Técnico", "Desarrollador Web", "Redes", "Analista de Sistemas", "Ing. de Software", " ", " ", " " }));
        bg.add(jcbProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 30));

        jtblEmpleadosBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Edad", "Profesion", "Cant. Contratos", "Calificacion", "Info. Academica", "Resenas", " "
            }
        ));
        jtblEmpleadosBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblEmpleadosBDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtblEmpleadosBDMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jtblEmpleadosBD);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 1310, 520));

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        bg.add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, 30));

        jButton1.setText("◄  Regresar al menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed

        this.buscar();
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Principal a = new Menu_Principal(user);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtblEmpleadosBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblEmpleadosBDMouseClicked
        int column = this.jtblEmpleadosBD.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/this.jtblEmpleadosBD.getRowHeight();
        String cd = (String) this.tblModel.getValueAt(this.jtblEmpleadosBD.getSelectedRow(), 0);
        this.frameInfo_Prof = new Info_Prof(cd);
        this.frameResenas = new Resenas(cd);
        this.frameContratar = new Contratar(cd);
        if(row < this.jtblEmpleadosBD.getRowCount() && row >= 0 && column < this.jtblEmpleadosBD.getColumnCount() && column >= 0){
            Object value = this.jtblEmpleadosBD.getValueAt(row, column);
            if(value instanceof JButton){
                //((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                if(boton.getName().equals("infoA")){
                   frameInfo_Prof.setVisible(true);
                }
                if(boton.getName().equals("Resena")){
                    if(this.frameResenas.tblModel.getRowCount() == 0)
                        JOptionPane.showMessageDialog(null, "No existen resenas de este usuario");
                    else
                        this.frameResenas.setVisible(true);
                }
                if(boton.getName().equals("Contacto"))
                    this.frameContratar.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_jtblEmpleadosBDMouseClicked

    private void jtblEmpleadosBDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblEmpleadosBDMouseEntered

    }//GEN-LAST:event_jtblEmpleadosBDMouseEntered

    
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
            java.util.logging.Logger.getLogger(BD_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BD_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BD_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BD_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BD_Tabla("L1").setVisible(true);
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

    public JTable getJtblEmpleadosBD() {
        return jtblEmpleadosBD;
    }

    public void setJtblEmpleadosBD(JTable jtblEmpleadosBD) {
        this.jtblEmpleadosBD = jtblEmpleadosBD;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookWork;
    private javax.swing.JLabel Minim;
    private javax.swing.JLabel X;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnMinim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JComboBox jcbProfesion;
    private javax.swing.JPanel jpBarraBotones;
    private javax.swing.JPanel jpEncabezado;
    private javax.swing.JTable jtblEmpleadosBD;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}
