/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Calificación extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    private ImageIcon imagen;
    private Icon icono;
    
    public Calificación() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.lblImagen, "src/imagenes/like_dislike.png");
    }
    
    public void updateBDcontrataciones(){
        String sql = "UPDATE contrataciones SET RES_CON=? WHERE ";
        PreparedStatement ps; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        bg = new javax.swing.JPanel();
        sldPunt = new javax.swing.JSlider();
        jpPuntos = new javax.swing.JPanel();
        lblNumP = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        jpEncabezado = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editPanePregunta = new javax.swing.JEditorPane();
        lblBoldPregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sldPunt.setMajorTickSpacing(1);
        sldPunt.setMaximum(5);
        sldPunt.setPaintLabels(true);
        sldPunt.setPaintTicks(true);
        sldPunt.setValue(0);
        sldPunt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldPuntStateChanged(evt);
            }
        });
        bg.add(sldPunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, 60));

        jpPuntos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpPuntos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPuntosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPuntosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPuntosMouseExited(evt);
            }
        });

        lblNumP.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblNumP.setText("0");

        lblPuntos.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblPuntos.setText("Puntos");

        javax.swing.GroupLayout jpPuntosLayout = new javax.swing.GroupLayout(jpPuntos);
        jpPuntos.setLayout(jpPuntosLayout);
        jpPuntosLayout.setHorizontalGroup(
            jpPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPuntosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblPuntos)
                .addContainerGap())
        );
        jpPuntosLayout.setVerticalGroup(
            jpPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPuntosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumP)
                    .addComponent(lblPuntos))
                .addContainerGap())
        );

        bg.add(jpPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 130, 40));

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

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("Calificación");

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpEncabezadoLayout = new javax.swing.GroupLayout(jpEncabezado);
        jpEncabezado.setLayout(jpEncabezadoLayout);
        jpEncabezadoLayout.setHorizontalGroup(
            jpEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jpEncabezadoLayout.setVerticalGroup(
            jpEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpEncabezadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bg.add(jpEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jScrollPane1.setViewportView(editPanePregunta);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 370, 149));

        lblBoldPregunta.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblBoldPregunta.setText("Pregunta");
        bg.add(lblBoldPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton1.setText("ENVIAR");
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldPuntStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldPuntStateChanged
        // TODO add your handling code here:
        this.lblNumP.setText(String.valueOf(this.sldPunt.getValue()));  
        if(this.sldPunt.getValue() == 1)
            this.lblPuntos.setText("Punto");
        else
            this.lblPuntos.setText("Puntos");
    }//GEN-LAST:event_sldPuntStateChanged

    private void jpEncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_jpEncabezadoMouseDragged

    private void jpEncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEncabezadoMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpEncabezadoMousePressed

    private void jpPuntosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPuntosMouseEntered
//        jpPuntos.setBorder(new javax.swing.border.EtchedBorder());
    }//GEN-LAST:event_jpPuntosMouseEntered

    private void jpPuntosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPuntosMouseExited
//        jpPuntos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jpPuntosMouseExited

    private void jpPuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPuntosMouseClicked
//        JOptionPane.showMessageDialog(null, "Esta seguro de su calificación ?");
    }//GEN-LAST:event_jpPuntosMouseClicked

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
            java.util.logging.Logger.getLogger(Calificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calificación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Calificación().setVisible(true);
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
    private javax.swing.JPanel bg;
    private javax.swing.JEditorPane editPanePregunta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpEncabezado;
    private javax.swing.JPanel jpPuntos;
    private javax.swing.JLabel lblBoldPregunta;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNumP;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JSlider sldPunt;
    // End of variables declaration//GEN-END:variables
}
