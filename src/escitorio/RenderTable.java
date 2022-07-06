/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author USUARIO
 */
public class RenderTable extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object render, boolean bln, boolean bln1, int i, int i1) {
        if(render instanceof JButton){
            return (JButton) render;
        }
        return super.getTableCellRendererComponent(jtable, render, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
}
