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
    String type="";
    String stado="";
    
    public Menu_Principal(String id) {
        initComponents();
        user=id;
        this.setLocationRelativeTo(null);
        cargarTabla(type,stado);
        cargarTablaContactos();
        jbtx_IniCon.setEnabled(false);
        jbtx_FinCon.setEnabled(false);
        jbtn_DeleteCon.setEnabled(false);
        this.pintarImagen(this.lblImagenLogo, "src/imagenes/Logo Aplicacion.png");
        this.pintarImagen(this.lblImagenContrac, "src/imagenes/contratacion.png");
        this.pintarImagen(this.lblImagenGuard, "src/imagenes/Guardar-icon.png");
    }

    public void cargarTabla(String tipo, String estado){
        
        
        try {
            String [] titulos = {"#","CLIENTE","EMPLEADO","ESTADO","PROCESO"};
            String [] registros = new String[5];
            modelo = new DefaultTableModel(null,titulos);
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            
            String sql ="";
            String comando ="select *from CONTRATACIONES where CED_CLI_CON=(select CED_CLI from CLIENTES where USE_CLI='"+user+"')";
            String testigo ="";
            switch(tipo) 
            {
                             
            case "Aceptados":
            testigo=comando+" and EST_INI_CON=true";
            break;
            case "Pendientes":
            testigo=comando+" and EST_INI_CON is NULL";
            break;
            case "Rechasados":
            testigo=comando+" and EST_INI_CON=false";
            break;
            default:
            testigo=comando+"";
            }   
            
///////////////////////////////////////////////////////////////////////////////
            switch(estado) 
            {                           
            case "Activos":
            sql=testigo+" and EST_FIN_CON=false;";
            break;
            case "Terminados":
            sql=testigo+" and EST_FIN_CON=true;";
            break;
            default:
            sql=testigo+";";         
            }  
///////////////////////////////////////////////////////////////////////////////
            
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);
            while(rs.next())
            { 
                registros[0]=rs.getString("ID_CON");
                registros[1]=rs.getString("CED_CLI_CON");
                registros[2]=rs.getString("CED_EMP_CON");
               // registros[2]="PENDIENTE";

                if(rs.getBoolean("EST_INI_CON"))
                {
                    registros[3]="Aceptado";
                } 
                else{
                    if(rs.getString("EST_INI_CON")==null)
                    registros[3]="Pendiente";
                    else
                        registros[3]="Rechazado";
                }
                
                if(rs.getBoolean("EST_FIN_CON"))
                {
                    registros[4]="Terminado";
                } 
                else{
                    if(rs.getString("EST_FIN_CON")==null)
                    registros[4]=" - - - ";
                    else
                        registros[4]="Activo";
                }

                modelo.addRow(registros);
                
            }
            jtbl_ContratosRecientes.setModel(modelo);

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }
    
    public void cargarTablaContactos(){
        
        try {
            String [] titulos = {"EMPLEADO","Descripcion","Telefono","ID"};
            String [] registros = new String[4];
            modelo = new DefaultTableModel(null,titulos);
            Conexion cc=new Conexion();
            Connection cn = cc.localhost("proy_agiles");
            String sql = "select C.ID_CONT, C.DES_CONT, C.CED_EMP_CONT, C.CED_EMP_CONT ,"
                    + " E.emp_telefono FROM CONTACTOS C, empleados E \n" +
                "where ID_CONT in (SELECT ID_CONT FROM CONTACTOS WHERE USE_CLI_CONT = '"+user+"')\n" +
                "GROUP BY ID_CONT";
            Statement psd = cn.createStatement();
            ResultSet rs=psd.executeQuery(sql);
            while(rs.next())
            {
                
                registros[0]=rs.getString("C.CED_EMP_CONT");
                registros[1]=rs.getString("C.DES_CONT");
                registros[2]=rs.getString("E.emp_telefono");
                registros[3]=rs.getString("C.ID_CONT");
          
                modelo.addRow(registros);
            }
            jtbl_Contactos.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
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
        jbtx_back = new javax.swing.JLabel();
        bgContrataciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_ContratosRecientes = new javax.swing.JTable();
        Contactos_Guardados = new javax.swing.JLabel();
        bgContacG = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_Contactos = new javax.swing.JTable();
        jpNuevaContra = new javax.swing.JPanel();
        lblImagenContrac = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImagenGuard = new javax.swing.JLabel();
        jcbx_contrataciones = new javax.swing.JComboBox<>();
        jcbx_proceso = new javax.swing.JComboBox<>();
        jbtx_FinCon = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbtn_DeleteCon = new javax.swing.JButton();
        jbtx_IniCon = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jbtx_back.setBackground(new java.awt.Color(255, 255, 255));
        jbtx_back.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jbtx_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtx_back.setText("<html> Contrataciones <br> <center>Recientes</center> </html>");
        jbtx_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtx_backMouseClicked(evt);
            }
        });
        bg.add(jbtx_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 400, 136));

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
        jtbl_ContratosRecientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_ContratosRecientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_ContratosRecientes);

        bgContrataciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        bg.add(bgContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 430, 300));

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
        jtbl_Contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_ContactosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_Contactos);

        bgContacG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        bg.add(bgContacG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 350, 290));

        jpNuevaContra.setBackground(new java.awt.Color(125, 140, 125));
        jpNuevaContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpNuevaContraMouseClicked(evt);
            }
        });

        lblImagenContrac.setPreferredSize(new java.awt.Dimension(145, 155));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("<html>\n<center>\nNueva\n<br>\nContratación\n</center>\n</html>");

        javax.swing.GroupLayout jpNuevaContraLayout = new javax.swing.GroupLayout(jpNuevaContra);
        jpNuevaContra.setLayout(jpNuevaContraLayout);
        jpNuevaContraLayout.setHorizontalGroup(
            jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaContraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagenContrac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpNuevaContraLayout.setVerticalGroup(
            jpNuevaContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaContraLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenContrac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bg.add(jpNuevaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 150, 170));

        lblImagenGuard.setBackground(new java.awt.Color(102, 255, 255));
        bg.add(lblImagenGuard, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 90, 90));

        jcbx_contrataciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Aceptados", "Rechasados", "Pendientes" }));
        jcbx_contrataciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbx_contratacionesItemStateChanged(evt);
            }
        });
        bg.add(jcbx_contrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 100, -1));

        jcbx_proceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Terminados" }));
        jcbx_proceso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbx_procesoItemStateChanged(evt);
            }
        });
        bg.add(jcbx_proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 100, -1));

        jbtx_FinCon.setText("Finalizar Contratacion");
        jbtx_FinCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtx_FinConActionPerformed(evt);
            }
        });
        bg.add(jbtx_FinCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 150, 40));

        jButton1.setText("Añair Contacto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 120, 30));

        jbtn_DeleteCon.setText("Eliminar Contacto");
        jbtn_DeleteCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_DeleteConActionPerformed(evt);
            }
        });
        bg.add(jbtn_DeleteCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 150, 30));

        jbtx_IniCon.setText("Iniciar Trabajo");
        jbtx_IniCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtx_IniConActionPerformed(evt);
            }
        });
        bg.add(jbtx_IniCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 150, 40));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 40));

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

    private void jbtx_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtx_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtx_backMouseClicked

    private void jcbx_contratacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbx_contratacionesItemStateChanged
        type =jcbx_contrataciones.getSelectedItem().toString();
        cargarTabla(type,stado);
    }//GEN-LAST:event_jcbx_contratacionesItemStateChanged

    private void jcbx_procesoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbx_procesoItemStateChanged
        stado =jcbx_proceso.getSelectedItem().toString();
        cargarTabla(type,stado);
    }//GEN-LAST:event_jcbx_procesoItemStateChanged

    private void jtbl_ContratosRecientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_ContratosRecientesMouseClicked
        jbtx_FinCon.setEnabled(true);
        jbtx_IniCon.setEnabled(true);
    }//GEN-LAST:event_jtbl_ContratosRecientesMouseClicked

    private void jbtx_FinConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtx_FinConActionPerformed
        if(jtbl_ContratosRecientes.getSelectedRow()!=-1)
                    {
                int fila=jtbl_ContratosRecientes.getSelectedRow();
                String cod = jtbl_ContratosRecientes.getValueAt(fila, 0).toString();
                String est = jtbl_ContratosRecientes.getValueAt(fila, 4).toString();
                //Activo
                if(est.equalsIgnoreCase("Activo")){   
            try {
                Conexion cc=new Conexion();
                Connection cn = cc.localhost("proy_agiles");
                String sql="UPDATE CONTRATACIONES SET EST_FIN_CON=true WHERE ID_CON='"+cod+"';";
                PreparedStatement psd = cn.prepareStatement(sql);
                int n =psd.executeUpdate();
                if(n>0)
                {
                cargarTabla(type,stado);
                }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
                
                    }
            }
    }//GEN-LAST:event_jbtx_FinConActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AñadirContacto nuevo = new AñadirContacto(user);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtn_DeleteConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_DeleteConActionPerformed
                if(jtbl_Contactos.getSelectedRow()!=-1)
                    {
                int fila=jtbl_Contactos.getSelectedRow();
                String idcon = jtbl_Contactos.getValueAt(fila, 3).toString();

                //Activo
           
            try {
                Conexion cc=new Conexion();
                Connection cn = cc.localhost("proy_agiles");
                String sql="DELETE FROM CONTACTOS WHERE ID_CONT='"+idcon+"';";
                PreparedStatement psd = cn.prepareStatement(sql);
                int n =psd.executeUpdate();
                
                cargarTablaContactos();
                
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
                
                    
            }
    }//GEN-LAST:event_jbtn_DeleteConActionPerformed

    private void jtbl_ContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_ContactosMouseClicked
        jbtn_DeleteCon.setEnabled(true);
        cargarTablaContactos();
    }//GEN-LAST:event_jtbl_ContactosMouseClicked

    private void jbtx_IniConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtx_IniConActionPerformed
        if(jtbl_ContratosRecientes.getSelectedRow()!=-1)
                    {
                int fila=jtbl_ContratosRecientes.getSelectedRow();
                String cod = jtbl_ContratosRecientes.getValueAt(fila, 0).toString();
                String est_A = jtbl_ContratosRecientes.getValueAt(fila, 3).toString();
                String est = jtbl_ContratosRecientes.getValueAt(fila, 4).toString();
                //Activo
                if(est.equalsIgnoreCase(" - - - ") && est_A.equalsIgnoreCase("Aceptado")){   
            try {
                Conexion cc=new Conexion();
                Connection cn = cc.localhost("proy_agiles");
                String sql="UPDATE CONTRATACIONES SET EST_FIN_CON=false WHERE ID_CON='"+cod+"';";
                PreparedStatement psd = cn.prepareStatement(sql);
                int n =psd.executeUpdate();
                if(n>0)
                {
                cargarTabla(type,stado);
                }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
                
                    }
            }
    }//GEN-LAST:event_jbtx_IniConActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarTabla("","");
        cargarTablaContactos();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel Minim;
    private javax.swing.JLabel X;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgContacG;
    private javax.swing.JPanel bgContrataciones;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnMinim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_DeleteCon;
    private javax.swing.JButton jbtx_FinCon;
    private javax.swing.JButton jbtx_IniCon;
    private javax.swing.JLabel jbtx_back;
    private javax.swing.JComboBox<String> jcbx_contrataciones;
    private javax.swing.JComboBox<String> jcbx_proceso;
    private javax.swing.JPanel jpBarraBotones;
    private javax.swing.JPanel jpEncabezado;
    private javax.swing.JPanel jpNuevaContra;
    private javax.swing.JTable jtbl_Contactos;
    private javax.swing.JTable jtbl_ContratosRecientes;
    private javax.swing.JLabel lblImagenContrac;
    private javax.swing.JLabel lblImagenGuard;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}
