/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class BG_Base extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    private ImageIcon imagen;
    private Icon icono;
    
    public BG_Base() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.lblImagenLogo, "src/imagenes/Logo Aplicacion.png");
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

        bg.add(jpEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(BG_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BG_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BG_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BG_Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BG_Base().setVisible(true);
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
    private javax.swing.JLabel Minim;
    private javax.swing.JLabel X;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnMinim;
    private javax.swing.JPanel jpBarraBotones;
    private javax.swing.JPanel jpEncabezado;
    private javax.swing.JLabel lblImagenLogo;
    // End of variables declaration//GEN-END:variables
}